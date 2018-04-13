package com.example.nikita.seawind;

public class FoodListingInfo  {
    private String foodname;
    private String utemquantity;
    String key;
    public FoodListingInfo(String foodname,String utemquantity,String key)
    {
        this.foodname = foodname;
        this.utemquantity = utemquantity;
        this.key=key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTable()
    {
        return foodname;
    }

    public String getOrder()
    {
        return utemquantity;
    }



}