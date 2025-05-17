/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author elizabeth
 */
public class Order {
//    declare the variables
    private final String orderId;
    private final List<CartItem> items;
    private final double totalPrice;
    private final LocalDate orderDate;
    

    
    // Constructor to create an order with ID and list of cart items
    // Makes a deep copy of the items to preserve order state at checkout
  public Order(String orderId, List<CartItem> items) {
    this.orderId = orderId;
    this.items = new ArrayList<>();
    for (CartItem item : items) {
        this.items.add(new CartItem(item.getProduct(), item.getQuantity(), item.getSelectedSize()));
    }
    this.totalPrice = calculateTotalPrice();
    this.orderDate = LocalDate.now();
}


//    Calculates the total price of all items in the order.
    private double calculateTotalPrice() {
       double total = 0;
        for (CartItem item : items) {
            total += item.getProduct().getPrice() * item.getQuantity();
        }
        return total;
    }
    
    
    // Calculates the total price by summing up each item's price times quantity
    public String getOrderId() { return orderId; }
    public double getTotalPrice() { return totalPrice; }
    public LocalDate getOrderDate() { return orderDate; }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        for (CartItem item : items) {
            System.out.println(item);
        }
        System.out.println("Total: " + String.format("₦%,.2f", totalPrice));
        System.out.println("Date: " + orderDate);
    }

}
