package com.designpatterns.exercise4;

//Test
public class AdapterTest {
 public static void main(String[] args) {

     // PayPal payment
     PaymentProcessor paypal = new PayPalAdapter(new PayPalGateway());
     paypal.processPayment(100.0);

     // Stripe payment
     PaymentProcessor stripe = new StripeAdapter(new StripeGateway());
     stripe.processPayment(200.0);

     // Razorpay payment
     PaymentProcessor razorpay = new RazorpayAdapter(new RazorpayGateway());
     razorpay.processPayment(3000.0);
 }
}