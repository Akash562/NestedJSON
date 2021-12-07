package com.mmi.nestedjson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView myView;

    private LinearLayoutManager linearLayoutManager;
    private DividerItemDecoration dividerItemDecoration;
    private List<Model_all> myList;
    private Adapter_check adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myView = findViewById(R.id.myview);

        myList = new ArrayList<>();
        adapter = new Adapter_check(getApplicationContext(),myList);

        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        dividerItemDecoration = new DividerItemDecoration(myView.getContext(), linearLayoutManager.getOrientation());

        myView.setHasFixedSize(true);
        myView.setLayoutManager(linearLayoutManager);
        myView.addItemDecoration(dividerItemDecoration);
        myView.setAdapter(adapter);

        VolleyCheck();
    }


    public void VolleyCheck() {

        String url = "http://typing.darshilsoftware.in/api/v1/product/test/list?type=LIVE";

        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.setCancelable(false);
        progressDialog.show();

        RequestQueue requestQueue= Volley.newRequestQueue(getApplicationContext());
        StringRequest stringRequest=new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                progressDialog.dismiss();

                try {

                    JSONObject jsonObject=new JSONObject(response);

                    JSONObject Jobject = jsonObject.getJSONObject("data");
                    JSONArray jsonArray=Jobject.getJSONArray("list");

                    if (jsonArray.length() > 0){
                        for(int i=0;i<jsonArray.length();i++) {
                            JSONObject jsonObject1 = jsonArray.getJSONObject(i);
                            Model_all mall = new Model_all();
                            mall.setTest_id(jsonObject1.getString("test_id"));
                            mall.setParagraph(jsonObject1.getString("paragraph"));
                            mall.setDuration(jsonObject1.getString("duration"));
                            myList.add(mall);
                        }
                        adapter.notifyDataSetChanged();
                        progressDialog.dismiss();

                    } else {
                        Toast.makeText(getApplication(), "No Record Found", Toast.LENGTH_SHORT).show();
                    }

                }catch (JSONException e){e.printStackTrace();}
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                progressDialog.dismiss();
                error.printStackTrace();

            }
        });
        RetryPolicy policy = new DefaultRetryPolicy(30000, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(policy);
        requestQueue.add(stringRequest);

    }

}