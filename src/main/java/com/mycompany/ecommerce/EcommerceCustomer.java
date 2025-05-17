/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;

import java.util.List;

/**
 *
 * @author elizabeth
 */

//Interface defining customer functionalities in my e-commerce system
public interface EcommerceCustomer {
     //Returns a list of products within the specified category
   List<Product> browseByCategory(String category);
   
   //Searches and returns products that match the given name
    List<Product> searchProducts(String name);
    
    //Returns a list of all available products in the store
    List<Product> listAllProducts();
    
    //Places an order for the items in the customer's cart and returns the created order
    Order checkout(Customer customer, String orderId); 
}
