package com.project.entity;

public class Purchase {
    private Payment paymentMethod;
    private Double amount;

    public Purchase(Payment paymentMethod, Double amount) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    public Double processPayment() {
        Double total = paymentMethod.pay(amount);
        return total;
    }
}
