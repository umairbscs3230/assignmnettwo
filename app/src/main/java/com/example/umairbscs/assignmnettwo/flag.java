package com.example.umairbscs.assignmnettwo;

public class flag {

    String name;
    private int thumbnail;

    public flag(String name, int thumbnail) {
        this.name = name;
        this.thumbnail = thumbnail;
    }

    public flag(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

}