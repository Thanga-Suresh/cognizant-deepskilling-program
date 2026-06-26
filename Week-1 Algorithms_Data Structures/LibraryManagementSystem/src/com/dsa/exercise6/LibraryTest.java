package com.dsa.exercise6;

public class LibraryTest {

    public static void main(String[] args) {

        Book[] books = {
            new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book(2, "Clean Code", "Robert C. Martin"),
            new Book(3, "Design Patterns", "Gang of Four"),
            new Book(4, "Effective Java", "Joshua Bloch"),
            new Book(5, "Refactoring", "Martin Fowler")
        };

        // Linear Search
        System.out.println("=== Linear Search ===");
        Book result1 = BookSearch.linearSearch(books, "Clean Code");
        System.out.println(result1 != null ? result1 : "Book not found");

        // Binary Search (sorted array)
        System.out.println("\n=== Binary Search ===");
        Book[] sorted = BookSearch.sortByTitle(books);
        Book result2 = BookSearch.binarySearch(sorted, "Clean Code");
        System.out.println(result2 != null ? result2 : "Book not found");

        // Not found
        System.out.println("\n=== Search for non-existent book ===");
        Book result3 = BookSearch.linearSearch(books, "Unknown Book");
        System.out.println(result3 != null ? result3 : "Book not found");
    }
}
