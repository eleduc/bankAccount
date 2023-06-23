package com.interview.bank;

import java.time.LocalDateTime;

/**
 * This class is responsible to define an operation done on an account
 */
public class BankOperation {

    private final LocalDateTime date;
    private final TypeOperation type;
    private final double amount;


    public BankOperation(TypeOperation type, final double amount) {
        this.date = LocalDateTime.now();
        this.type = type;
        this.amount = amount;
    }

    public LocalDateTime getLocalDateTime() {
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
