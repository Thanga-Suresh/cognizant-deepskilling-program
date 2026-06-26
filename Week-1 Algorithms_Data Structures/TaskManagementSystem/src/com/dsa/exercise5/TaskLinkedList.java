package com.dsa.exercise5;

public class TaskLinkedList {

    private Task head;

    // Add to end - O(n)
    public void addTask(Task task) {
        if (head == null) {
            head = task;
        } else {
            Task current = head;
            while (current.next != null)
                current = current.next;
            current.next = task;
        }
        System.out.println("Task Added Successfully");
    }

    // Search - O(n)
    public Task searchTask(int taskId) {
        Task current = head;
        while (current != null) {
            if (current.taskId == taskId)
                return current;
            current = current.next;
        }
        return null;
    }

    // Traverse - O(n)
    public void traverseTasks() {
        Task current = head;
        while (current != null) {
            System.out.println("---------------------");
            System.out.println(current);
            current = current.next;
        }
    }

    // Delete - O(n)
    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.taskId == taskId) {
            head = head.next;
            System.out.println("Task Deleted Successfully");
            return;
        }
        Task current = head;
        while (current.next != null) {
            if (current.next.taskId == taskId) {
                current.next = current.next.next;
                System.out.println("Task Deleted Successfully");
                return;
            }
            current = current.next;
        }
        System.out.println("Task Not Found");
    }
}
