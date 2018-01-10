package com.example.dell.obama.model;

/**
 * Created by DELL on 12/22/2017.
 */

public class Model {
    private int imageId;
    private int titleId;
    private int subtitleId;

    public Model(int imageId, int titleId, int subtitleId) {
        this.imageId = imageId;
        this.titleId = titleId;
        this.subtitleId = subtitleId;
    }

    public int getImageId() {
        return imageId;
    }

    public int getTitle() {
        return titleId;
    }

    public int getSubtitle() {
        return subtitleId;
    }
}