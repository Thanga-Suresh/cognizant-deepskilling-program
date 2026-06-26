# E-commerce Platform Search Function

## 1. Big O Notation

Big O notation describes the upper bound of an algorithm's time complexity as input size grows.
It helps compare algorithm efficiency regardless of hardware.

| Notation | Name        | Example              |
|----------|-------------|----------------------|
| O(1)     | Constant    | HashMap lookup       |
| O(log n) | Logarithmic | Binary Search        |
| O(n)     | Linear      | Linear Search        |
| O(n²)    | Quadratic   | Nested loops         |

### Search Scenarios

| Scenario | Linear Search | Binary Search |
|----------|--------------|---------------|
| Best     | O(1)         | O(1)          |
| Average  | O(n)         | O(log n)      |
| Worst    | O(n)         | O(log n)      |

## 2. Algorithm Comparison

| Algorithm     | Time Complexity | Requires Sorted Data |
|---------------|-----------------|----------------------|
| Linear Search | O(n)            | No                   |
| Binary Search | O(log n)        | Yes                  |

## 3. Recommendation

- Use **Binary Search** when the product list is large and sorted (e.g., by name or ID).
- Use **Linear Search** for small datasets or unsorted data.
- For an e-commerce platform with thousands of products, Binary Search or HashMap-based lookup is preferred.
