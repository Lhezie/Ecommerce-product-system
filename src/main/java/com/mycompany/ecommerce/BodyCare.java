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
public class BodyCare extends Product {
  //declaring the bodycare variables
    private int volume;
    private List<String> ingredients;
    
    
    
   //initialize the objects(constructor)
    public BodyCare(String productId, String productName, String description, double price, String category, List<String> ingredients, int volume) {
        super(productId, productName, description, price, category);
        
        
        this.ingredients = ingredients;
        this.volume = volume;
        
    }
    
    
   //get and set variables to be able to access the private viariables
    public int getVolume(){return volume;}
    public void setVolume(int volume){
    this.volume=volume;
    }
    
     public List<String> getIngredients(){return ingredients;}
     
      public void setIngredients(List<String> ingredients){
    this.ingredients=ingredients;
    }
    
  

   //change how the object is printed out.It will get the 
   //attribute from the product class and include the bodycare attribbutes  
    @Override
    public String toString() {
        return super.toString()+ "Volume:" + volume + ", Ingredients" + ingredients; 
    }

       
}
