package com.dsa.exercise2;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Headphones", "Electronics"),
            new Product(104, "Backpack", "Accessories"),
            new Product(105, "Watch", "Accessories")
        };

        // Linear Search
        System.out.println("=== Linear Search ===");
        Product result1 = ProductSearch.linearSearch(products, "Headphones");
        System.out.println(result1 != null ? result1 : "Product not found");

        // Binary Search (sorted array)
        System.out.println("\n=== Binary Search ===");
        Product[] sorted = ProductSearch.sortByName(products);
        Product result2 = ProductSearch.binarySearch(sorted, "Headphones");
        System.out.println(result2 != null ? result2 : "Product not found");

        // Not found case
        System.out.println("\n=== Search for non-existent product ===");
        Product result3 = ProductSearch.linearSearch(products, "Tablet");
        System.out.println(result3 != null ? result3 : "Product not found");
    }
}
