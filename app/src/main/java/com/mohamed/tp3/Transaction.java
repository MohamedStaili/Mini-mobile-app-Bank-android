package com.mohamed.tp3;

import java.util.Date;

public class Transaction {
    private int ImageId ;
    private String title ;
    private  double price ;
    private Date date ;

    public Transaction(int imageId, String title, double price, Date date){
        this.title = title ;
        this.ImageId = imageId ;
        this.price = price ;
        this.date = date ;
    }


    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
