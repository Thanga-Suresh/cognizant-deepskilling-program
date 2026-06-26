# Financial Forecasting

## 1. Recursion

Recursion is a technique where a method calls itself with a smaller sub-problem until a base case is reached.
It simplifies problems that have a naturally repetitive structure, like compound interest calculation.

Formula: FV = PV × (1 + r)^n

Recursive breakdown:
- futureValue(PV, r, 0) = PV
- futureValue(PV, r, n) = futureValue(PV × (1 + r), r, n - 1)

## 2. Time Complexity

| Approach   | Time Complexity | Space Complexity |
|------------|-----------------|------------------|
| Recursive  | O(n)            | O(n) call stack  |
| Memoized   | O(n)            | O(n) memo table  |
| Iterative  | O(n)            | O(1)             |

## 3. Optimization

- Simple recursion for linear growth is already O(n) and doesn't repeat sub-problems.
- Memoization helps when the same year value is computed multiple times (branching scenarios).
- For this specific formula, an iterative or direct formula approach — PV × (1 + r)^n — is O(1) and most efficient.
- Avoid deep recursion (large n) without memoization or iteration to prevent stack overflow.
