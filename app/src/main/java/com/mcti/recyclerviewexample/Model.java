package com.mcti.recyclerviewexample;

public class Model {
    private String title;
    private int fee;

    public Model(String title, int fee) {
        this.title = title;
        this.fee = fee;
    }

    public String getTitle() {
        return title;
    }

    public int getFee() {
        return fee;
    }

}
