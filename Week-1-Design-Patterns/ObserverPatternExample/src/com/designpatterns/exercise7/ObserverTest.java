package com.designpatterns.exercise7;

public class ObserverTest {
    public static void main(String[] args) {

        StockMarket apple = new StockMarket("AAPL");

        Observer mobileApp = new MobileApp("StockTracker");
        Observer webApp = new WebApp("MarketWatch");
        Observer mobileApp2 = new MobileApp("RobinHood");

        // Register observers
        apple.register(mobileApp);
        apple.register(webApp);
        apple.register(mobileApp2);

        System.out.println("-- Price change 1 --");
        apple.setPrice(175.50);

        System.out.println("----------------------");

        // Deregister one observer
        System.out.println("Deregistering RobinHood...");
        apple.deregister(mobileApp2);

        System.out.println("----------------------");

        System.out.println("-- Price change 2 --");
        apple.setPrice(182.30);
    }
}
