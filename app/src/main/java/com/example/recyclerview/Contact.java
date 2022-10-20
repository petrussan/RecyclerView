package com.example.recyclerview;

public class Contact {
    private String tName;
    private int imgId;

    public Contact(String name, int imgId) {
        this.tName = name;
        this.imgId = imgId;
    }

    public String getName() {
        return tName;
    }

    public int getImgId() {
        return imgId;
    }

    public void setName(String name) {
        this.tName = name;
    }

    public void setImgId(int i) {
        this.imgId = i;
    }
}
