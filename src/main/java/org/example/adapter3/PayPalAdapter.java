package org.example.adapter3;

public class PayPalAdapter implements PaymentProcessor {
    private PayPalPayment payPalPayment;

    public PayPalAdapter(PayPalPayment payPalPayment) {
        this.payPalPayment = payPalPayment;
    }

    @Override
    public void processPayment(String amount) {
        payPalPayment.makePayment(amount);
    }
}
