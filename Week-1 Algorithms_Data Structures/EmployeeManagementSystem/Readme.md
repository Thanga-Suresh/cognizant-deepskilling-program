# Employee Management System

## 1. Array Memory Representation

Arrays store elements in contiguous memory locations. Each element is accessible via an index
in O(1) time using base address + (index × element size).

Advantages:
- Fast index-based access: O(1)
- Cache-friendly due to contiguous memory
- Simple to implement

## 2. Time Complexity

| Operation | Time Complexity |
|-----------|-----------------|
| Add       | O(1)            |
| Search    | O(n)            |
| Traverse  | O(n)            |
| Delete    | O(n)            |

## 3. Limitations of Arrays

- Fixed size — must define capacity upfront
- Deletion requires shifting elements (or swapping with last)
- Inserting at a specific position is O(n)
- Not suitable when size changes frequently

## 4. When to Use Arrays

- When size is known and fixed
- When fast index-based access is needed
- When memory efficiency is important
