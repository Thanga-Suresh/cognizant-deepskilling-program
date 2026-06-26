package com.dsa.exercise3;

import java.util.Arrays;

public class OrderTest {

    public static void main(String[] args) {

        Order[] orders1 = {
            new Order(1, "Alice", 4500.00),
            new Order(2, "Bob", 1200.50),
            new Order(3, "Charlie", 8900.75),
            new Order(4, "Diana", 300.00),
            new Order(5, "Eve", 6750.25)
        };

        Order[] orders2 = Arrays.copyOf(orders1, orders1.length);

        // Bubble Sort
        System.out.println("=== Bubble Sort (by Total Price) ===");
        OrderSorter.bubbleSort(orders1);
        for (Order o : orders1) {
            System.out.println("---------------------");
            System.out.println(o);
        }

        // Quick Sort
        System.out.println("\n=== Quick Sort (by Total Price) ===");
        OrderSorter.quickSort(orders2, 0, orders2.length - 1);
        for (Order o : orders2) {
            System.out.println("---------------------");
            System.out.println(o);
        }
    }
}
