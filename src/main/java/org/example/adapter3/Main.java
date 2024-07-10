package org.example.adapter3;

public class Main {
    public static void main(String[] args) {

        PaymentProcessor creditCardProcessor = new CreditCardProcessor();
        PayPalPayment payPalPayment = new PayPalPayment();
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPalPayment);

        System.out.println("Credit Card Payment:");
        creditCardProcessor.processPayment("100.00");

        System.out.println("PayPal Payment through Adapter:");
        payPalAdapter.processPayment("200.00");
    }
}