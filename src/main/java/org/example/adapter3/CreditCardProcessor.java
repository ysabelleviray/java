package org.example.adapter3;

public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment(String amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
