package com.designpatterns.exercise6;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromServer();
    }

    private void loadFromServer() {
    	 System.out.println("Loading image from remote server: " + fileName);
         try {
             Thread.sleep(2000); // simulate delay
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + fileName);
    }
}
