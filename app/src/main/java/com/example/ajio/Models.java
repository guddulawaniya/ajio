package com.example.ajio;

import android.widget.ImageView;

public class Models {
    int image;

    public Models(int image) {
        this.image = image;
    }

    String textname;


    String productname,producttitle,price,discount,bestprice;
    int productimage;

    public Models(String productname, String producttitle, String price, String discount, String bestprice, int productimage) {
        this.productname = productname;
        this.producttitle = producttitle;
        this.price = price;
        this.discount = discount;
        this.bestprice = bestprice;
        this.productimage = productimage;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProducttitle() {
        return producttitle;
    }

    public void setProducttitle(String producttitle) {
        this.producttitle = producttitle;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getBestprice() {
        return bestprice;
    }

    public void setBestprice(String bestprice) {
        this.bestprice = bestprice;
    }

    public int getProductimage() {
        return productimage;
    }

    public void setProductimage(int productimage) {
        this.productimage = productimage;
    }

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
