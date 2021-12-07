package com.mmi.nestedjson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class Adapter_check extends RecyclerView.Adapter<Adapter_check.ViewHolder> {

    private Context context;
    private List<Model_all> list;

    public Adapter_check(Context context, List<Model_all> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.single_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Model_all movie = list.get(position);

        holder.testid.setText(movie.getTest_id());
        holder.paragraph.setText(String.valueOf(movie.getParagraph()));
        holder.duration.setText(String.valueOf(movie.getDuration()));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView testid, paragraph, duration;

        public ViewHolder(View itemView) {
            super(itemView);

            testid = itemView.findViewById(R.id.test_id);
            paragraph = itemView.findViewById(R.id.paragraph);
            duration = itemView.findViewById(R.id.duration);

        }
    }

}