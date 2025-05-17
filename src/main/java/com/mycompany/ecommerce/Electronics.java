/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;

/**
 *
 * @author elizabeth
 */
public class Electronics extends Product {
//    declaring the variables for warrantyPeriod and brand
   private int warrantyPeriod; 
   private String brand;
   
   
   
 // Constructor to initialise the object with specific attributes
   public Electronics (String productId, String productName, String description, double price, String category, int warrantyPeriod, String brand){
   
    super(productName, description, productId, price, category);
    this.warrantyPeriod = warrantyPeriod;
    this.brand = brand;
   
   }
   
//   getters and setters to make the private variable accessible elsewhere when needed
   public int getWarrantyPeriod()
   {
   return warrantyPeriod;
   }
   public void setWarrantyPeriod(int warrantyPeriod)
   {
   this.warrantyPeriod = warrantyPeriod;
   }
   
   public String getBrand()
   {
       return brand;
   }
   
   public void setBrand(String brand)
   {
       this.brand = brand;
   }
   
//  change how the object is printed out.It will get the 
//  attribute from the product class and include the electronics attribbutes
  @Override
  public String toString() {
        return super.toString() + ", Brand: " + brand + 
               ", Warranty: " + warrantyPeriod + " months";
    }
}
