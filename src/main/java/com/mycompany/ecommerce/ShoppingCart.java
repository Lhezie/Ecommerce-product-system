/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author elizabeth
 */
public class ShoppingCart {
    
    // List to hold all items added to the cart
    private List<CartItem> items;
    
    // Constructor to initialise an empty cart
    public ShoppingCart()
    {
    items = new ArrayList<>();
    }
   
    
     // Adds a product to the cart with the specified quantity and selected size
    // If the same product and size already exist in the cart, it updates the quantity
    // Throws an exception if product is null or quantity is invalid
    public void addProductToCart(Product product, int quantity, String selectedSize) {
    if (product == null || quantity <= 0) throw new IllegalArgumentException();

    for (CartItem item : items) {
        // Match both product and size (if size matters)
        boolean sameProduct = item.getProduct().getProductId().equals(product.getProductId());
        boolean sameSize = (item.getSelectedSize() == null && selectedSize == null)
                        || (item.getSelectedSize() != null && item.getSelectedSize().equals(selectedSize));
        if (sameProduct && sameSize) {
            item.setQuantity(item.getQuantity() + quantity);
            return;
        }
    }
    items.add(new CartItem(product, quantity, selectedSize));
}

    
//    delete product based on the productId
    public void removeProduct(Product product)
    {
    items.removeIf(item -> 
            item.getProduct().getProductId().equals(product.getProductId()));
    }
    
//    update the product in the cart. If the product quqntity is
//    0 0r less, call removeProduct() else set the correct quantity
    public void updateProduct(Product product, int quantity)
    {
    for (CartItem item : items)
    {
    if (item.getProduct().getProductId().equals(product.getProductId()))
    {
    
     if(quantity <= 0)
     {
        removeProduct(product);
     }
       else 
     {
         item.setQuantity(quantity);
      }
    return;
   }
    
    }
    
    
   System.out.println("Can not find product in cart");
  
    }

//  get the total amount of items in the cart
  public double getTotalPrice(){
    double total = 0.0;
    
    for (CartItem item : items){
    total += item.getProduct().getPrice() * item.getQuantity();
    }
   return total;

}

  
// returns all cart items
  public List<CartItem> getItems()
  {
  return new ArrayList<>(items);
  }
  
// Clears all items from the cart
  public void clearCart()
  {
  items.clear();
  }
  
  

// Displays all items in the cart along with the total price
  public void displayCart()
  
  {
    if (items.isEmpty())
    {
     System.out.println("Your Shopping Cart is Empty");
    }
    else
    {
       System.out.println("Your Cart Content:");
       for(CartItem item : items)
       {
           System.out.println(item.toString());
           
       }
       System.out.println("Total Price: ₦ " + getTotalPrice());
    }
  }
}
  
  
  
 


