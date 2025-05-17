/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;

/**
 *
 * @author elizabeth
 */
public class Books extends Product {
   //declare the variables
    private String author;
    private String publisher;
    
    
   //initialize the objects(constructor)
    public Books(String productId, String productName, String description, double price, String category, String author, String publisher) {
        super(productId, productName, description, price, category);
    
    this.author = author;
    this.publisher = publisher;
    
    }
    
    
    //get and set variables to be able to access the private viariables
    public String getAuthor(){
    return author;
    }
    
    public void setAuthor(String author){
    this.author = author;
    }
    
    public String getPublisher(){
    return publisher;
    }
    
    public void setPublisher(String publisher){
    this.publisher = publisher;
    }
    
    
  //change how the object is printed out.It will get the 
  //attribute from the product class and include the books attribbutes
    @Override
    public String toString() {
        return super.toString() + "Author: "+ author + "Publisher:" + publisher; 
    }

}
