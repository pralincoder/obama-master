package com.example.dell.obama.model;

/**
 * Created by DELL on 1/5/2018.
 */

public class Samasad_model {
    private String title,subnews;
    private int imageid;

    public Samasad_model(String title, String subnews, int imageid) {
        this.title = title;
        this.subnews = subnews;
        this.imageid = imageid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubnews() {
        return subnews;
    }

    public void setSubnews(String subnews) {
        this.subnews = subnews;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }
}
