package com.designpatterns.exercise1;

//TestSingleton.java
public class TestSingletonPattern {
 public static void main(String[] args) {

     // Get Logger instances
     Logger logger1 = Logger.getInstance();
     Logger logger2 = Logger.getInstance();

     // Use logger
     logger1.log("First message");
     logger2.log("Second message");

     // Check if both references are same
     System.out.println("Are both instances same? " + (logger1 == logger2));
 }
}