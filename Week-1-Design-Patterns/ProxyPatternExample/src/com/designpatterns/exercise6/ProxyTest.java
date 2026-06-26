package com.designpatterns.exercise6;

public class ProxyTest {
    public static void main(String[] args) {

        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // First call - loads from remote server
        System.out.println("-- First display (loads from server) --");
        image1.display();

        System.out.println("----------------------");

        // Second call - served from cache
        System.out.println("-- Second display (served from cache) --");
        image1.display();

        System.out.println("----------------------");

        // image2 first call - loads from remote server
        System.out.println("-- image2 first display (loads from server) --");
        image2.display();

        System.out.println("----------------------");

        // image2 second call - served from cache
        System.out.println("-- image2 second display (served from cache) --");
        image2.display();
    }
}
