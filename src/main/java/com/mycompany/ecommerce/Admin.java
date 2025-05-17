/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;

/**
 *
 * @author elizabeth
 */

//Admin inherits from the User super class
public class Admin extends User {
    // Constructor to initialise an Admin with user ID and name
    public Admin(String userId, String name) {
        
// Pass the userId and name to the User class constructor to initialise it

        super(userId, name);
    }
}
