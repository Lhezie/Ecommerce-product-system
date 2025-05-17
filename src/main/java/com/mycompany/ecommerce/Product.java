/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;

/**
 *
 * @author elizabeth
 */
public abstract class Product {
//    // Declare common product attributes
    private String productId;
    private String productName;
    private String description;
    private double price;
    private String category;

    
 // Create the constructor to initialise a product with its attributes
    public Product(String productId, String productName, String description, double price, String category ){
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.category = category;
    
    }
      //setters and getters to make the variables accessible when needed
       public String getProductId(){return productId;}
       public void setProductId(String productId) { this.productId = productId;}


       public String getName(){return productName;}
       public void setName(String productName){this.productName = productName;}

       public String getDescription() { return description; }
       public void setDescription(String description) { this.description = description; }

       public double getPrice() { return price; }
       public void setPrice(double price) { this.price = price; }

       public String getCategory() { return category; }

       
      //print commom product details
       @Override
       public String toString() {
        return "Product ID: " + productId + 
               ", Name: " + productName + 
               ", Price: ₦" + String.format("%,.2f", price)   + 
                ", Category: " + category;
    }
}