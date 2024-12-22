package com.example.finalexamapp;



public class Note {
    private String title;
    private int imageResId;

    public Note(String title, int imageResId) {
        this.title = title;
        this.imageResId = imageResId;
    }

    public String getTitle() {
        return title;
    }

    public int getImageResId() {
        return imageResId;
    }

}
