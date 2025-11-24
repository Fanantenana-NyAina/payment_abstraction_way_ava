package com.project.entity;

import com.project.entity.methode.PaymentMethode;

public class Purchase {
    private PaymentMethode paymentMethod;
    private Double amount;

    public Purchase(PaymentMethode paymentMethod, Double amount) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    public PaymentMethode getPaymentMethod() {
        return paymentMethod;
    }

    public Double getAmount() {
        return amount;
    }
}
