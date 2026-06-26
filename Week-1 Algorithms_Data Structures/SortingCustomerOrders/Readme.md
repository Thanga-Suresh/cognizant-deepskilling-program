# Sorting Customer Orders

## 1. Sorting Algorithms Overview

| Algorithm      | Best     | Average  | Worst    | Space  |
|----------------|----------|----------|----------|--------|
| Bubble Sort    | O(n)     | O(n²)    | O(n²)    | O(1)   |
| Insertion Sort | O(n)     | O(n²)    | O(n²)    | O(1)   |
| Quick Sort     | O(n log n) | O(n log n) | O(n²) | O(log n) |
| Merge Sort     | O(n log n) | O(n log n) | O(n log n) | O(n) |

## 2. Time Complexity Comparison

| Algorithm   | Time Complexity (Average) |
|-------------|--------------------------|
| Bubble Sort | O(n²)                    |
| Quick Sort  | O(n log n)               |

## 3. Why Quick Sort over Bubble Sort?

- Quick Sort is significantly faster for large datasets due to O(n log n) average complexity.
- Bubble Sort performs O(n²) comparisons even for moderately sized arrays.
- Quick Sort sorts in-place with O(log n) stack space, making it memory-efficient.
- For an e-commerce platform with thousands of orders, Quick Sort is the practical choice.
