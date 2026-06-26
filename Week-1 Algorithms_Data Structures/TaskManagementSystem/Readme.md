# Task Management System

## Linked List

A Linked List is a linear data structure where elements (nodes) are connected using pointers (references). Unlike arrays, elements are not stored in contiguous memory.

## 1. Types of Linked Lists

- Singly Linked List: Each node points to the next node. Traversal is one-directional.
- Doubly Linked List: Each node has pointers to both next and previous nodes. Allows bidirectional traversal.

## 2. Time Complexity

| Operation | Time Complexity |
|-----------|-----------------|
| Add       | O(n)            |
| Search    | O(n)            |
| Traverse  | O(n)            |
| Delete    | O(n)            |

Add to head is O(1), but add to tail requires traversal O(n) unless a tail pointer is maintained.

## 3. Linked Lists vs Arrays

| Feature          | Array         | Linked List   |
|------------------|---------------|---------------|
| Size             | Fixed         | Dynamic       |
| Index Access     | O(1)          | O(n)          |
| Insert/Delete    | O(n)          | O(1) at head  |
| Memory           | Contiguous    | Non-contiguous|

## 4. When to Use Linked Lists

- When the number of elements changes dynamically
- When frequent insertions/deletions at the beginning are needed
- When memory allocation flexibility is important
