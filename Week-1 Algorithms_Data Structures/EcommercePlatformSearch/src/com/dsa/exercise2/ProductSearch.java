package com.dsa.exercise2;

import java.util.Arrays;

public class ProductSearch {

    // Linear Search - O(n)
    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.getProductName().equalsIgnoreCase(name))
                return p;
        }
        return null;
    }

    // Binary Search - O(log n) - requires sorted array by productName
    public static Product binarySearch(Product[] sortedProducts, String name) {
        int low = 0, high = sortedProducts.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = sortedProducts[mid].getProductName().compareToIgnoreCase(name);
            if (cmp == 0)
                return sortedProducts[mid];
            else if (cmp < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return null;
    }

    // Sort array by productName for binary search
    public static Product[] sortByName(Product[] products) {
        Product[] sorted = Arrays.copyOf(products, products.length);
        Arrays.sort(sorted, (a, b) -> a.getProductName().compareToIgnoreCase(b.getProductName()));
        return sorted;
    }
}
