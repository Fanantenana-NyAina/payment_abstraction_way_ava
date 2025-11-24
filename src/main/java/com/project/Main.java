package com.project;

import com.project.entity.Purchase;
import com.project.entity.methode.CashPayment;
import com.project.entity.methode.ChequePayment;
import com.project.entity.methode.MobileMoneyPayment;
import com.project.entity.methode.VisaPayment;

public class Main {
    public static void main(String[] args) {
        VisaPayment visaPayment = new VisaPayment(2_000.0d);
        CashPayment cashPayment = new CashPayment(20_000.0d);
        ChequePayment chequePayment = new ChequePayment();
        MobileMoneyPayment mobileMoneyPayment = new MobileMoneyPayment(1_000.0d);


        Purchase purchaseWithVisa = new Purchase(visaPayment, 10_000.0d);
        System.out.println("purchaseWithVisaTotal : "+ purchaseWithVisa.processPayment());

        Purchase purchaseWithCash = new Purchase(cashPayment, 10_000.0d);
        System.out.println("purchaseWithCashTotal : "+ purchaseWithCash.processPayment());

        Purchase purchaseWithCheque = new Purchase(chequePayment, 10_000.0d);
        System.out.println("purchaseWithChequeTotal : "+ purchaseWithCheque.processPayment());

        Purchase purchaseWithMobileMoney = new Purchase(mobileMoneyPayment, 10_000.0d);
        System.out.println("purchaseWithMobileMoneyTotal : "+ purchaseWithMobileMoney.processPayment());
    }
}