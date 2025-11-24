package com.project.entity.methode;

import com.project.entity.Payment;

public class VisaPayment implements Payment {
    private Double withDrawFees;

    public VisaPayment(Double withDrawFees) {
        this.withDrawFees = withDrawFees;
    }

    @Override
    public Double pay(Double amount) {
        return amount + withDrawFees;
    }
}
