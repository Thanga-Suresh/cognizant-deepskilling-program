package com.designpatterns.exercise10;

public class MVCTest {
    public static void main(String[] args) {

        Student student = new Student("Alice", "S101", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        System.out.println("-- Initial Student Details --");
        controller.updateView();

        System.out.println("----------------------");

        // Update student details via controller
        controller.setName("Alice Johnson");
        controller.setGrade("A+");

        System.out.println("-- Updated Student Details --");
        controller.updateView();
    }
}
