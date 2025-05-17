/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;

/**
 *
 * @author elizabeth
 */
public class Customer extends User {
    
   //Each customer has their own shopping cart
    
    private ShoppingCart cart;

    
     //Constructor to initialise Customer with userId and name
    //Also creates a new empty ShoppingCart for the customer
    public Customer(String userId, String name) {
        super(userId, name);
        this.cart = new ShoppingCart();
    }

    
    //Getter to access the customer's shopping cart
    public ShoppingCart getCart() { return cart; }
    
}
