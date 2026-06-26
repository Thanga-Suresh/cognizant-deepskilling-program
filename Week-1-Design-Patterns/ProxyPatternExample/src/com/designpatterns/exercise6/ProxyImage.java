package com.designpatterns.exercise6;

public class ProxyImage implements Image {
    private String fileName;
    private RealImage cachedImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (cachedImage == null) {
            cachedImage = new RealImage(fileName);
        } else {
            System.out.println("Serving from cache: " + fileName);
        }
        cachedImage.display();
    }
}
