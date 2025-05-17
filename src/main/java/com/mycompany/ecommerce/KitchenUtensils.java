/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;

/**
 *
 * @author elizabeth
 */
public class KitchenUtensils extends Product {
    
// Declare private variables for utensil type and material
    
    private String utensilType;      
    private String material;        
   

    
    // Constructor to initialise the object with specific attributes
    public KitchenUtensils
        (
            String productId, 
            String productName, 
            String description, 
            double price, 
            String category, 
            String utensilType, 
            String material
        ) 
        {
        super(productId, productName, description, price, category);
        this.utensilType = utensilType;
        this.material = material;
       
    }

   // Getters and setters to make utensil type and material variables accessible 
    public String getUtensilType() {
        return utensilType;
    }
    public void setUtensilType(String utensilType) {
        this.utensilType = utensilType;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

   
 
//   Get the attributes from the product class and include KitchenUtensils attributes
    
    @Override
    public String toString() {
        return super.toString()
            + "Type: " + utensilType + "\n"
            + "Material: " + material + "\n";
           
    }
    
}
