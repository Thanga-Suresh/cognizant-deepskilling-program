package com.dsa.exercise1;

import java.util.HashMap;

public class Inventory {

 private HashMap<Integer, Product> products = new HashMap<>();

 // Add Product
 public void addProduct(Product product) {

     products.put(product.getProductId(), product);

     System.out.println("Product Added Successfully");
 }

 // Update Product
 public void updateProduct(int id, String name, int quantity, double price) {

     Product product = products.get(id);

     if (product != null) {

         product.setProductName(name);
         product.setQuantity(quantity);
         product.setPrice(price);

         System.out.println("Product Updated Successfully");

     } else {

         System.out.println("Product Not Found");

     }

 }

 // Delete Product
 public void deleteProduct(int id) {

     if (products.remove(id) != null)

         System.out.println("Product Deleted Successfully");

     else

         System.out.println("Product Not Found");

 }

 // Display Products
 public void displayProducts() {

     for (Product p : products.values()) {

         System.out.println("---------------------");
         System.out.println(p);

     }

 }

}
