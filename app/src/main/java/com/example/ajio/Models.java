package com.example.ajio;

import android.widget.ImageView;

public class Models {
    int image;
    String textname;

    public Models(int image, String picname) {
        this.image = image;
        this.textname = picname;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPicname() {
        return textname;
    }

    public void setPicname(String picname) {
        this.textname = picname;
    }
}
