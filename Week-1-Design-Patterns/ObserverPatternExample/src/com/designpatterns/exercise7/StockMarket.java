package com.designpatterns.exercise7;

import java.util.ArrayList;
import java.util.List;

//Concrete Subject (StockMarket)
public class StockMarket implements Stock {
    private String stockName;
    private double price;
    private List<Observer> observers = new ArrayList<>();

    public StockMarket(String stockName) {
        this.stockName = stockName;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, price);
        }
    }
}
