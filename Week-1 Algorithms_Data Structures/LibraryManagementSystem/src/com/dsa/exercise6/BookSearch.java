package com.dsa.exercise6;

import java.util.Arrays;

public class BookSearch {

    // Linear Search by title - O(n)
    public static Book linearSearch(Book[] books, String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title))
                return b;
        }
        return null;
    }

    // Binary Search by title - O(log n), requires sorted array
    public static Book binarySearch(Book[] sortedBooks, String title) {
        int low = 0, high = sortedBooks.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = sortedBooks[mid].getTitle().compareToIgnoreCase(title);
            if (cmp == 0)
                return sortedBooks[mid];
            else if (cmp < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return null;
    }

    // Sort books by title for binary search
    public static Book[] sortByTitle(Book[] books) {
        Book[] sorted = Arrays.copyOf(books, books.length);
        Arrays.sort(sorted, (a, b) -> a.getTitle().compareToIgnoreCase(b.getTitle()));
        return sorted;
    }
}
