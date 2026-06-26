package com.designpatterns.exercise3;

public class BuilderTest {
 public static void main(String[] args) {

     // Computer 1 (high-end gaming PC)
     Computer gamingPC = new Computer.Builder()
             .setCPU("Intel i9")
             .setRAM("32GB")
             .setStorage("1TB SSD")
             .setGPU("RTX 4080")
             .build();

     gamingPC.showConfig();

     System.out.println("----------------------");

     // Computer 2 (basic office PC)
     Computer officePC = new Computer.Builder()
             .setCPU("Intel i5")
             .setRAM("8GB")
             .setStorage("512GB SSD")
             .build();

     officePC.showConfig();
 }
}