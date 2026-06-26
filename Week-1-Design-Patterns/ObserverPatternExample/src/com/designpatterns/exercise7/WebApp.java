package com.designpatterns.exercise7;

public class WebApp implements Observer {
    private String appName;

    public WebApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("[WebApp - " + appName + "] " + stockName + " price updated to: $" + price);
    }
}
