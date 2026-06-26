package com.dsa.exercise4;

public class EmployeeManager {

    private Employee[] employees;
    private int size;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    // Add - O(1)
    public void addEmployee(Employee emp) {
        if (size == employees.length) {
            System.out.println("Array is full. Cannot add employee.");
            return;
        }
        employees[size++] = emp;
        System.out.println("Employee Added Successfully");
    }

    // Search - O(n)
    public Employee searchEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == id)
                return employees[i];
        }
        return null;
    }

    // Traverse - O(n)
    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println("---------------------");
            System.out.println(employees[i]);
        }
    }

    // Delete - O(n)
    public void deleteEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == id) {
                employees[i] = employees[size - 1];
                employees[size - 1] = null;
                size--;
                System.out.println("Employee Deleted Successfully");
                return;
            }
        }
        System.out.println("Employee Not Found");
    }
}
