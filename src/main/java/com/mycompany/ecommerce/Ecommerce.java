/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecommerce;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author elizabeth
 */
public class Ecommerce {

    public static void main(String[] args) {
        
        
        //scanner to read users input from the terminal
        Scanner scanner = new Scanner(System.in);
        
        
        EcommerceStore system = new EcommerceStore();

        // Load sample data (categories and products)
        preloadSampleData(system);

        
        
        boolean exit = false;
        while (!exit) {
            System.out.println("\n Welcome to my E-Commerce Store ");
            System.out.println("1. Administrator Menu");
            System.out.println("2. Customer Menu");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    adminMenu(scanner, system);
                    break;
                case "2":
                    customerMenu(scanner, system);
                    break;
                case "3":
                    exit = true;
                    System.out.println("Thank you for using the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    // Pre-loaded categories and products
  private static void preloadSampleData(EcommerceStore system) {
    // Add categories
    system.addCategory("Electronics");
    system.addCategory("Clothing");
    system.addCategory("Books");
    system.addCategory("BodyCare");
    system.addCategory("KitchenUtensils");

    // Add 5 Electronics
    system.addProduct(new Electronics("E001", "Laptop", "High performance laptop", 500000.0,
            "Electronics", 24, "Dell"));
    system.addProduct(new Electronics("E002", "Smartphone", "Latest model smartphone", 350000.0,
            "Electronics", 12, "Samsung"));
    system.addProduct(new Electronics("E003", "Tablet", "10-inch display tablet", 200000.0,
            "Electronics", 12, "Apple"));
    system.addProduct(new Electronics("E004", "Bluetooth Headphones", "Noise-cancelling headphones", 80000.0,
            "Electronics", 6, "Sony"));
    system.addProduct(new Electronics("E005", "Smartwatch", "Fitness tracking smartwatch", 90000.0,
            "Electronics", 12, "Fitbit"));

    // Add 5 Clothing
    system.addProduct(new Clothing("C001", "Denim Shirt", "Stylish denim shirt", 25000.0,
    "Clothing", List.of("S", "M", "L", "XL"), "Blue"));

    system.addProduct(new Clothing("C002", "Leather Jacket", "Genuine leather jacket", 95000.0,
    "Clothing", List.of("M", "L", "XL"), "Black"));

    system.addProduct(new Clothing("C003", "Summer Dress", "Floral summer dress", 40000.0,
    "Clothing", List.of("S", "M", "L"), "Red"));

    system.addProduct(new Clothing("C004", "Sneakers", "Casual sneakers", 35000.0,
    "Clothing", List.of("39", "40", "41", "42", "43"), "White"));

    system.addProduct(new Clothing("C005", "Sweatpants", "Comfortable sweatpants", 20000.0,
    "Clothing", List.of("S", "M", "L", "XL"), "Grey"));


    // Add 5 Books
    system.addProduct(new Books("B001", "Dream Count", "Bestselling Novel", 15000.0,
            "Books", "Chimamanda Adiche", "HarperCollins Publishers"));
    system.addProduct(new Books("B002", "Half of a Yellow Sun", "Award-winning novel", 18000.0,
            "Books", "Chimamanda Adiche", "Farafina"));
    system.addProduct(new Books("B003", "The Alchemist", "Philosophical novel", 12000.0,
            "Books", "Paulo Coelho", "HarperCollins"));
    system.addProduct(new Books("B004", "Purple Hibiscus", "Critically acclaimed novel", 16000.0,
            "Books", "Chimamanda Adiche", "Algonquin"));
    system.addProduct(new Books("B005", "Atomic Habits", "Self-improvement book", 22000.0,
            "Books", "James Clear", "Penguin Random House"));

    // Add 5 BodyCare
    system.addProduct(new BodyCare("BC001", "Olay BodyWash", "Moisturizing body wash", 18000.0,
            "BodyCare", List.of("Water", "Fragrance", "Natural Oils"), 500));
    system.addProduct(new BodyCare("BC002", "Dove Soap", "Gentle cleansing soap", 3500.0,
            "BodyCare", List.of("Sodium Lauroyl", "Moisturizers"), 100));
    system.addProduct(new BodyCare("BC003", "Nivea Lotion", "Deep nourishing lotion", 8500.0,
            "BodyCare", List.of("Aqua", "Glycerin", "Almond Oil"), 400));
    system.addProduct(new BodyCare("BC004", "Shea Butter", "100% natural shea butter", 12000.0,
            "BodyCare", List.of("Shea Butter"), 300));
    system.addProduct(new BodyCare("BC005", "Clearasil Face Wash", "Deep cleansing face wash", 7000.0,
            "BodyCare", List.of("Salicylic Acid", "Menthol"), 150));

    // Add 5 Kitchen Utensils
    system.addProduct(new KitchenUtensils("KU001", "Spatula", "Non-stick spatula", 38000.0,
            "KitchenUtensils", "Spatula", "Silicone"));
    system.addProduct(new KitchenUtensils("KU002", "Whisk", "Stainless steel whisk", 5000.0,
            "KitchenUtensils", "Whisk", "Stainless Steel"));
    system.addProduct(new KitchenUtensils("KU003", "Chef Knife", "Professional chef knife", 25000.0,
            "KitchenUtensils", "Knife", "Carbon Steel"));
    system.addProduct(new KitchenUtensils("KU004", "Cutting Board", "Large wooden cutting board", 15000.0,
            "KitchenUtensils", "Board", "Bamboo"));
    system.addProduct(new KitchenUtensils("KU005", "Measuring Cups", "Set of 4 measuring cups", 8000.0,
            "KitchenUtensils", "Measuring Cups", "Plastic"));

    // To Print the available categories & products
    System.out.println("\nAvailable Categories:");
    for (String category : system.getCategories()) {
        System.out.println(category);
    }

    System.out.println("\nAvailable Products - SHOP NOW:");
    for (Product product : system.listAllProducts()) {
        System.out.println(product.getName());
    }
}



    // Administrator menu
    private static void adminMenu(Scanner scanner, EcommerceStore system) {
        boolean adminExit = false;
        while (!adminExit) {
            System.out.println("\nAdministrator Menu");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Update Product");
            System.out.println("4. Add Category");
            System.out.println("5. List Categories");
            System.out.println("6. Back to Main Menu");
            System.out.println("7. Generate Sales Report");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addProduct(scanner, system);
                    break;
                case "2":
                    System.out.print("Enter Product ID to remove: ");
                    String removeId = scanner.nextLine();
                    system.removeProduct(removeId);
                    System.out.println(removeId + " has been removed successfully");
                    break;
                case "3":
                    System.out.print("Enter Product ID to update: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Enter new Price: ");
                    double newPrice = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter new Description: ");
                    String newDesc = scanner.nextLine();
                    system.updateProduct(updateId, newPrice, newDesc);
                    System.out.println(updateId + " has been updated successfully");
                    break;
                case "4":
                    System.out.print("Enter new category name: ");
                    String category = scanner.nextLine();
                    system.addCategory(category);
                    System.out.println(category + " has been added successfully");
                    break;
                case "5":
                    system.listCategories();
                    break;
                case "6":
                    adminExit = true;
                    break;
                case "7":
                    system.generateSalesReport();
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Allows administrator to add a new product
    private static void addProduct(Scanner scanner, EcommerceStore system) {
        System.out.print("Enter Product Type "
                + "(1: Electronics, "
                + "2: Clothing, "
                + "3: Books, "
                + "4: BodyCare, "
                + "5: KitchenUtensils): ");

        int type = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Enter Product ID: ");
        String productId = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Description: ");
        String description = scanner.nextLine();
        System.out.print("Enter Price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter Category: ");
        String category = scanner.nextLine();

        Product product = null;
        switch (type) {
            case 1:
                System.out.print("Enter Warranty Period (months): ");
                int warranty = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter Brand: ");
                String brand = scanner.nextLine();
                product = new Electronics(productId, name, description, price, category, warranty, brand);
                System.out.println( name + " has been added successfully");
                break;
            case 2:
                System.out.print("Enter Size (S, M, L,XL): ");
                String sizesInput = scanner.nextLine();
                List<String> availableSizes = Arrays.asList(sizesInput.split("\\s*,\\s*"));  
                System.out.print("Enter Color: ");
                String color = scanner.nextLine();
                product = new Clothing(productId, name, description, price, category, availableSizes, color);
                System.out.println( name + " has been added successfully");
                break;
            case 3:
                System.out.print("Enter Author: ");
                String author = scanner.nextLine();
                System.out.print("Enter Publisher: ");
                String publisher = scanner.nextLine();
                product = new Books(productId, name, description, price, category, author, publisher);
                System.out.println( name + " has been added successfully");
                break;
            case 4:
                // Prompt for volume in millilitres
               System.out.print("Enter Volume (ml): ");
               int volume = Integer.parseInt(scanner.nextLine());
               System.out.print("Enter Ingredients (eg water, oils, vitamin c): ");
               String ingredientsInput = scanner.nextLine();
               List<String> ingredients = Arrays.asList(ingredientsInput.split(",\\s*"));
               product = new BodyCare(productId, name, description, price, category, ingredients, volume);
               System.out.println( name + " has been added successfully");
               break;
            case 5:
               System.out.print("Enter Utensil Type: ");
               String utensilType = scanner.nextLine();
               System.out.print("Enter Material: ");
               String material = scanner.nextLine();
               product = new KitchenUtensils(productId, name, description, price, category, utensilType, material);
               System.out.println( name + " has been added successfully");
               break;

            default:
                System.out.println("Invalid product type.");
        }
        if (product != null) {
            system.addProduct(product);
        }
    }

   // Customer menu for shopping functionalities
    private static void customerMenu(Scanner scanner, EcommerceStore system) {
    System.out.print("Enter Customer ID: ");
    String custId = scanner.nextLine();
    System.out.print("Enter Your Name: ");
    String custName = scanner.nextLine();
    Customer customer = new Customer(custId, custName);

    boolean custExit = false;
    while (!custExit) {
        System.out.println("\n Customer Menu ");
        System.out.println("1. Browse Products by Category");
        System.out.println("2. Search Products");
        System.out.println("3. Add Product to Cart");
        System.out.println("4. View Cart");
        System.out.println("5. Checkout");
        System.out.println("6. Back to Main Menu");
        System.out.print("Enter your choice: ");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.print("Enter Category: ");
                String category = scanner.nextLine();
                List<Product> byCategory = system.browseByCategory(category);
                if (byCategory.isEmpty()) {
                    System.out.println("No products found in this category.");
                } else {
                    byCategory.forEach(System.out::println);
                }
                break;
            case "2":
                System.out.print("Enter Product Name to Search: ");
                String name = scanner.nextLine();
                List<Product> searchResults = system.searchProducts(name);
                if (searchResults.isEmpty()) {
                    System.out.println("No products found matching that name.");
                } else {
                    searchResults.forEach(System.out::println);
                }
                break;
            case "3":
               System.out.print("Enter Product Name to Add to Cart: ");
               String prodName = scanner.nextLine();
               Product selected = system.findProductByName(prodName);  // <-- Make sure you have this method!
    
                if (selected == null) {
                    System.out.println("Product not found.");
               } else {
                    String selectedSize = null;
               if (selected instanceof Clothing) {
                   Clothing clothing = (Clothing) selected;
                   System.out.println("Available Sizes: " + clothing.getAvailableSizes());
                   System.out.print("Enter the size you want to add: ");
                   selectedSize = scanner.nextLine();
               if (!clothing.getAvailableSizes().contains(selectedSize)) {
                System.out.println("Invalid size selected.");
                return;
            }
        }
               System.out.print("Enter Quantity: ");
               int qty = Integer.parseInt(scanner.nextLine());
               customer.getCart().addProductToCart(selected, qty, selectedSize);
               System.out.println("Product added to cart.");
    }
                break;


            case "4":
                customer.getCart().displayCart();
                break;
            case "5":
                System.out.print("Enter Order ID: ");
                String orderId = scanner.nextLine();
                Order order = system.checkout(customer, orderId);
                order.displayOrder();
                break;
            case "6":
                custExit = true;
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}


}

    

