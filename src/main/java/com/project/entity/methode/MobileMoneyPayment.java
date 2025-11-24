package com.project.entity.methode;

import com.project.entity.Payment;

public class MobileMoneyPayment implements Payment {
    private Double withDrawFees;

    public MobileMoneyPayment(Double withDrawFees) {
        this.withDrawFees = withDrawFees;
    }

    @Override
    public Double pay(Double amount) {
            return amount + withDrawFees;
    }
}
