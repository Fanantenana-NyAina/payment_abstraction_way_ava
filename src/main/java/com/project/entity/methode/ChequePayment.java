package com.project.entity.methode;

import com.project.entity.Payment;

public class ChequePayment implements Payment {
    @Override
    public Double pay(Double amount) {
        return amount;
    }
}
