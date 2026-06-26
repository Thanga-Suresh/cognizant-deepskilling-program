package com.dsa.exercise5;

public class TaskTest {

    public static void main(String[] args) {

        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(1, "Design Database Schema", "Pending"));
        taskList.addTask(new Task(2, "Develop REST APIs", "In Progress"));
        taskList.addTask(new Task(3, "Write Unit Tests", "Pending"));

        System.out.println("\n=== All Tasks ===");
        taskList.traverseTasks();

        System.out.println("\n=== Search Task ID 2 ===");
        Task found = taskList.searchTask(2);
        System.out.println(found != null ? found : "Task Not Found");

        System.out.println("\n=== Deleting Task ID 1 ===");
        taskList.deleteTask(1);

        System.out.println("\n=== After Deletion ===");
        taskList.traverseTasks();
    }
}
