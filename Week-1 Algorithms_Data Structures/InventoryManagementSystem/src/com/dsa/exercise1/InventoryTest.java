package com.dsa.exercise1;

public class InventoryTest {

 public static void main(String[] args) {

     Inventory inventory = new Inventory();

     Product p1 = new Product(101, "Laptop", 15, 65000);

     Product p2 = new Product(102, "Keyboard", 40, 800);

     Product p3 = new Product(103, "Mouse", 25, 450);

     inventory.addProduct(p1);
     inventory.addProduct(p2);
     inventory.addProduct(p3);

     System.out.println();

     inventory.displayProducts();

     System.out.println("\nUpdating Product...\n");

     inventory.updateProduct(102, "Mechanical Keyboard", 50, 1500);

     inventory.displayProducts();

     System.out.println("\nDeleting Product...\n");

     inventory.deleteProduct(103);

     inventory.displayProducts();

 }
}
