package com.dsa.exercise4;

public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager(10);

        manager.addEmployee(new Employee(1, "Alice", "Software Engineer", 85000));
        manager.addEmployee(new Employee(2, "Bob", "QA Engineer", 70000));
        manager.addEmployee(new Employee(3, "Charlie", "DevOps Engineer", 90000));

        System.out.println("\n=== All Employees ===");
        manager.traverseEmployees();

        System.out.println("\n=== Search Employee ID 2 ===");
        Employee found = manager.searchEmployee(2);
        System.out.println(found != null ? found : "Employee Not Found");

        System.out.println("\n=== Deleting Employee ID 2 ===");
        manager.deleteEmployee(2);

        System.out.println("\n=== After Deletion ===");
        manager.traverseEmployees();
    }
}
