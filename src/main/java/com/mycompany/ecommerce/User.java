/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;

/**
 *
 * @author udodirim
 */


//Creating a base user so both customer and admin can inherit from them.
public abstract class User {
//    declare the variables for userId and name
    private String userId;
    private String name;
    
 // Constructor to initialise user with ID and name
    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

//   getters to make the userId and name variables accessible when needed
    public String getUserId() { return userId; }
    public String getName() { return name; }

    
//   display the users details
    @Override
    public String toString() {
        return "User ID: " + userId + ", Name: " + name ;
    }
    
}
