package com.designpatterns.exercise8;

public class StrategyTest {
    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        // Pay with Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        context.executePayment(150.00);

        System.out.println("----------------------");

        // Switch to PayPal at runtime
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.executePayment(200.00);

        System.out.println("----------------------");

        // Switch back to Credit Card
        context.setPaymentStrategy(new CreditCardPayment("9876-5432-1098-7654"));
        context.executePayment(99.99);
    }
}
