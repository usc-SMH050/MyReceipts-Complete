package com.bignerdranch.android.MyReceipts;

import java.util.Date;
import java.util.UUID;

public class Receipt {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private String mDescription;
    private String mShopName;
    private double mLatitude;
    private double mLongitude;
    private String mHasSetLocation = "false";

    public Receipt(){
        this(UUID.randomUUID());
    }

    public Receipt(UUID id) {
        mId = id;
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public void setShopName(String name){
        mShopName = name;
    }

    public String getShopName(){
        return mShopName;
    }

    public double getLatitude(){
        return mLatitude;
    }

    public void setLatitude(Double latitude){
        mLatitude = latitude;
    }

    public double getLongitude(){
        return mLongitude;
    }

    public void setLongitude(Double longitude){
        mLongitude = longitude;
    }

    public void setDescription(String description){
        mDescription = description;
    }

    public String getDescription(){
        return mDescription;
    }

    public String getPhotoFilename(){
        return "IMG_" + getId().toString() + ".jpg";
    }

    public void setHasSetLocation(String i){
        this.mHasSetLocation = i;
    }

    public String getHasSetLocation(){
        return mHasSetLocation;
    }
}
