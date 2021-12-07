package com.mmi.nestedjson;

public class Model_all {

    String test_id;
    String test_name;
    String slug;
    String target_exam;
    String target_exam_code;
    String server_time;
    String language;
    String is_attempted;
    String is_available;
    String paragraph;
    String start_datetime;
    String end_datetime;
    String allow_backspace;
    String word_count;
    String allow_highlight;
    String highlight_type;
    String maximum_marks;
    String minimum_passing_marks;
    String duration;
    String minimum_speed;
    String minimum_words;
    String type;
    String result_type;

    public Model_all(){

    }

    public Model_all(String test_id, String test_name, String slug, String target_exam, String target_exam_code, String server_time, String language, String is_attempted, String is_available, String paragraph, String start_datetime, String end_datetime, String allow_backspace, String word_count, String allow_highlight, String highlight_type, String maximum_marks, String minimum_passing_marks, String duration, String minimum_speed, String minimum_words, String type, String result_type) {
        this.test_id = test_id;
        this.test_name = test_name;
        this.slug = slug;
        this.target_exam = target_exam;
        this.target_exam_code = target_exam_code;
        this.server_time = server_time;
        this.language = language;
        this.is_attempted = is_attempted;
        this.is_available = is_available;
        this.paragraph = paragraph;
        this.start_datetime = start_datetime;
        this.end_datetime = end_datetime;
        this.allow_backspace = allow_backspace;
        this.word_count = word_count;
        this.allow_highlight = allow_highlight;
        this.highlight_type = highlight_type;
        this.maximum_marks = maximum_marks;
        this.minimum_passing_marks = minimum_passing_marks;
        this.duration = duration;
        this.minimum_speed = minimum_speed;
        this.minimum_words = minimum_words;
        this.type = type;
        this.result_type = result_type;
    }

    public String getTest_id() {
        return test_id;
    }

    public void setTest_id(String test_id) {
        this.test_id = test_id;
    }

    public String getTest_name() {
        return test_name;
    }

    public void setTest_name(String test_name) {
        this.test_name = test_name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTarget_exam() {
        return target_exam;
    }

    public void setTarget_exam(String target_exam) {
        this.target_exam = target_exam;
    }

    public String getTarget_exam_code() {
        return target_exam_code;
    }

    public void setTarget_exam_code(String target_exam_code) {
        this.target_exam_code = target_exam_code;
    }

    public String getServer_time() {
        return server_time;
    }

    public void setServer_time(String server_time) {
        this.server_time = server_time;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getIs_attempted() {
        return is_attempted;
    }

    public void setIs_attempted(String is_attempted) {
        this.is_attempted = is_attempted;
    }

    public String getIs_available() {
        return is_available;
    }

    public void setIs_available(String is_available) {
        this.is_available = is_available;
    }

    public String getParagraph() {
        return paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    public String getStart_datetime() {
        return start_datetime;
    }

    public void setStart_datetime(String start_datetime) {
        this.start_datetime = start_datetime;
    }

    public String getEnd_datetime() {
        return end_datetime;
    }

    public void setEnd_datetime(String end_datetime) {
        this.end_datetime = end_datetime;
    }

    public String getAllow_backspace() {
        return allow_backspace;
    }

    public void setAllow_backspace(String allow_backspace) {
        this.allow_backspace = allow_backspace;
    }

    public String getWord_count() {
        return word_count;
    }

    public void setWord_count(String word_count) {
        this.word_count = word_count;
    }

    public String getAllow_highlight() {
        return allow_highlight;
    }

    public void setAllow_highlight(String allow_highlight) {
        this.allow_highlight = allow_highlight;
    }

    public String getHighlight_type() {
        return highlight_type;
    }

    public void setHighlight_type(String highlight_type) {
        this.highlight_type = highlight_type;
    }

    public String getMaximum_marks() {
        return maximum_marks;
    }

    public void setMaximum_marks(String maximum_marks) {
        this.maximum_marks = maximum_marks;
    }

    public String getMinimum_passing_marks() {
        return minimum_passing_marks;
    }

    public void setMinimum_passing_marks(String minimum_passing_marks) {
        this.minimum_passing_marks = minimum_passing_marks;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getMinimum_speed() {
        return minimum_speed;
    }

    public void setMinimum_speed(String minimum_speed) {
        this.minimum_speed = minimum_speed;
    }

    public String getMinimum_words() {
        return minimum_words;
    }

    public void setMinimum_words(String minimum_words) {
        this.minimum_words = minimum_words;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getResult_type() {
        return result_type;
    }

    public void setResult_type(String result_type) {
        this.result_type = result_type;
    }
}
