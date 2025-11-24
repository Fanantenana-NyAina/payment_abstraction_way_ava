package com.project.entity;

public class Purchase {
    private Payment paymentMethod;
    private Double amount;

    public Purchase(Payment paymentMethod, Double amount) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    public Payment getPaymentMethod() {
        return paymentMethod;
    }

    public Double getAmount() {
        return amount;
    }

    public void processPayment() {
        paymentMethod.pay(amount);
    }
}
