/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;

/**
 *
 * @author elizabeth
 */
public class CartItem {
    
   //declare the CartItem attributes
    private Product product;
    private int quantity;
    private String selectedSize;
    
    
    //Constructor to initialise a CartItem with product, quantity, and optional size
    public CartItem(Product product, int quantity, String selectedSize) {
        this.product = product;
        this.quantity = quantity;
        this.selectedSize = selectedSize;
    }
    
   //getters and setters to be able to access CartItem's private variables.
    public Product getProduct() { return product; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public String getSelectedSize() { return selectedSize; }
    
    
    
    
//Returns a string representation of the CartItem,
//including product details, quantity, and selected size (if applicable)
    @Override
    public String toString() {
        String info = product.toString() + ", Quantity: " + quantity;
        if (selectedSize != null) {
            info += ", Selected Size: " + selectedSize;
        }
        return info;
    }

}
