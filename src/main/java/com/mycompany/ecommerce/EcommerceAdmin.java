/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;

/**
 *
 * @author elizabeth
 */

//Interface defining administrator functionalities in the e-commerce system
public interface EcommerceAdmin {
    //Adds a new product to the system
    void addProduct(Product product);
    
    //Removes a product using its product ID
    void removeProduct(String productId);
    
    //Updates the price and description of an existing product
    void updateProduct(String productId, double newPrice, String newDescription);
    
    //Adds a new product category
    void addCategory(String category);
    
    //Lists all available product categories
    void listCategories();
    
     //Generates a sales report 
    void generateSalesReport();
    
}
