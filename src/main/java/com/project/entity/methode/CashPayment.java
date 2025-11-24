package com.project.entity.methode;

import com.project.entity.Payment;

public class CashPayment implements Payment {
    private Double givenAmount;

    public CashPayment(Double givenAmount) {
        this.givenAmount = givenAmount;
    }

    @Override
    public Double pay(Double amount) {
        if (amount < givenAmount) {
            return givenAmount - amount;
        }

        return amount;
    }
}
