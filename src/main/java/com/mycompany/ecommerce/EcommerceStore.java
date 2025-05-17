/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author elizabeth
 */
public class EcommerceStore implements EcommerceAdmin, EcommerceCustomer {
     // the list to store all products
   private List<Product> products = new ArrayList<>();
     // List to store all product categories
    private List<String> categories = new ArrayList<>();
//    list to store all of the completed orders
    private List<Order> orders = new ArrayList<>();
    

    // Adds a new product to the system
    // Also adds the product's category if it's not already in the list
    public void addProduct(Product product) {
        products.add(product);
        if (!categories.contains(product.getCategory())) {
            categories.add(product.getCategory());
        }
//        System.out.println("Product added: " + product.getName());
    }

    
// Removes a product from the system using its product ID
    public void removeProduct(String productId) {
        products.removeIf(p -> p.getProductId().equals(productId));
        System.out.println("Product removed: " + productId);
    }

    
// Updates the price and description of an existing product
    public void updateProduct(String productId, double newPrice, String newDescription) {
        for (Product p : products) {
            if (p.getProductId().equals(productId)) {
                p.setPrice(newPrice);
                p.setDescription(newDescription);
                System.out.println("Product updated: " + productId);
                return;
            }
        }
        System.out.println("Product not found: " + productId);
    }

    
     // Adds a new category if it doesn't already exist
    public void addCategory(String category) {
        if (!categories.contains(category)) {
            categories.add(category);
    //   System.out.println("Category added: " + category
        } else {
            System.out.println("Category already exists.");
        }
    }

    
    //list all of the categories to check all of the available categories
    public void listCategories() {
        System.out.println("Available Categories: " + categories);
    }
    
    
    // Returns a copy of all category names
      public List<String> getCategories() {
        return new ArrayList<>(categories);
    }
      
      
    // Finds and returns a product by its name. Ensure case-insensitivity
    public Product findProductByName(String name) {
    for (Product p : products) {
        if (p.getName().equalsIgnoreCase(name)) {
            return p;
        }
    }
    return null;
}


    // Customer functionalities
    // Returns a list of products based on their categories
    public List<Product> browseByCategory(String category) {
        return products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    // Searches for products that match the product name 
    public List<Product> searchProducts(String name) {
        return products.stream()
                .filter(p -> p.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    
     // Returns a list of all products in the store
    public List<Product> listAllProducts() {
        return new ArrayList<>(products);
    }
    
    
    //Generate the saloes report
    public void generateSalesReport() {
    if (orders.isEmpty()) {
        System.out.println("No orders have been placed yet.");
    } else {
        System.out.println("\n The Sales Report ");
        for (Order order : orders) {
            order.displayOrder();
            System.out.println("");
        }
    }
}


    
     // Processes checkout for a customer by creating a new order
    // Adds the order to the list and clears the customer's cart
    public Order checkout(Customer customer, String orderId) {
        Order newOrder = new Order(orderId, customer.getCart().getItems());
        orders.add(newOrder);
        customer.getCart().clearCart();
        System.out.println("Order placed: " + orderId);
        return newOrder;
    } 
}
