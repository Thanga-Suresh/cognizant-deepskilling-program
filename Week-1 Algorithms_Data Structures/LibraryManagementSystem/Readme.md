# Library Management System

## 1. Search Algorithms

- Linear Search: Checks each element one by one until the target is found or the list ends.
- Binary Search: Repeatedly divides the sorted list in half, discarding the half that cannot contain the target.

## 2. Time Complexity Comparison

| Algorithm     | Best | Average  | Worst    | Requires Sorted |
|---------------|------|----------|----------|-----------------|
| Linear Search | O(1) | O(n)     | O(n)     | No              |
| Binary Search | O(1) | O(log n) | O(log n) | Yes             |

## 3. When to Use Each Algorithm

| Scenario                              | Recommended Algorithm |
|---------------------------------------|-----------------------|
| Small dataset (< 100 books)           | Linear Search         |
| Large dataset, sorted by title/author | Binary Search         |
| Unsorted or frequently changing data  | Linear Search         |
| Static, sorted collection             | Binary Search         |

## 4. Recommendation

For a library with a large and sorted catalog, Binary Search is preferred.
For small or frequently updated collections, Linear Search is simpler and sufficient.
