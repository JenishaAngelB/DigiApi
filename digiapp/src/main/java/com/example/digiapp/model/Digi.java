package com.example.digiapp.model;

import jakarta.persistence.*;

@Entity
public class Digi {
    @Id
    int itemId;
    String itemName;
    Double price;
    int customerId;
    String customerName;
    String customerEmail;
    String customerPassword;
    String customerNo;
    String location;
    String previousPurchased;
    String offer;
    Double total;
    
    public Digi()
    {
        
    }
    
    
    public Digi(int itemId, String itemName, Double price, int customerId, String customerName, String customerEmail,
            String customerPassword, String customerNo, String location, String previousPurchased, String offer,
            Double total) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPassword = customerPassword;
        this.customerNo = customerNo;
        this.location = location;
        this.previousPurchased = previousPurchased;
        this.offer = offer;
        this.total = total;
    }
    public int getItemId() {
        return itemId;
    }


    public void setItemId(int itemId) {
        this.itemId = itemId;
    }


    public String getItemName() {
        return itemName;
    }


    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public Double getPrice() {
        return price;
    }


    public void setPrice(Double price) {
        this.price = price;
    }


    public int getCustomerId() {
        return customerId;
    }


    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }


    public String getCustomerName() {
        return customerName;
    }


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public String getCustomerEmail() {
        return customerEmail;
    }


    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }


    public String getCustomerPassword() {
        return customerPassword;
    }


    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }


    public String getCustomerNo() {
        return customerNo;
    }


    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }


    public String getPreviousPurchased() {
        return previousPurchased;
    }


    public void setPreviousPurchased(String previousPurchased) {
        this.previousPurchased = previousPurchased;
    }


    public String getOffer() {
        return offer;
    }


    public void setOffer(String offer) {
        this.offer = offer;
    }


    public Double getTotal() {
        return total;
    }


    public void setTotal(Double total) {
        this.total = total;
    }




   

}
