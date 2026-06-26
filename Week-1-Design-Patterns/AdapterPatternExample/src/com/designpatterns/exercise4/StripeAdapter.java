package com.designpatterns.exercise4;

public class StripeAdapter implements PaymentProcessor {

 private StripeGateway stripe;

 public StripeAdapter(StripeGateway stripe) {
     this.stripe = stripe;
 }

 @Override
 public void processPayment(double amount) {
     stripe.makeTransaction(amount);
 }
}