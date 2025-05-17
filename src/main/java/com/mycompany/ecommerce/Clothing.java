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
public class Clothing extends Product {
   //declaring the clothing variables
    private List<String> availableSizes;

    private String colour;

    
     //Constructor to initialise Clothing object with its specific attributes
    public Clothing(String productId, String productName, String description, double price, String category, List<String> availableSizes, String colour) {
    super(productId, productName, description, price, category);
    this.availableSizes = availableSizes;
    this.colour = colour;
}

    //get and set variables to be able to access the private viariables
    public List<String> getAvailableSizes() { return availableSizes; }
    public void setAvailableSizes(List<String> availableSizes) { this.availableSizes = availableSizes; }

    public String getColour() { return colour; }
    public void setColour(String color) { this.colour = color; }

    
    //Overriding to include available sizes and colour
    @Override
    public String toString() {
        return super.toString() + ", Size: " + availableSizes + ", Colour: " + colour;
    }
}
