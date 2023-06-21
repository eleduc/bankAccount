package com.interview.bank;

import java.util.Date;

public class BankOperation {

    private final Date date;
    private final TypeOperation type;
    private final double amount;


    public BankOperation(TypeOperation type, final double amount) {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public TypeOperation getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "BankOperation{" +
                "date=" + date +
                ", type=" + type +
                ", amount=" + amount +
                '}';
    }
}
