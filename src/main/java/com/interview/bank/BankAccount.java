package com.interview.bank;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private double balance;
    private List<BankOperation> operations;

    public BankAccount(final double initialAmount) {
        balance = initialAmount;
        operations = new ArrayList();
    }

    public boolean doDeposit(final double amount) {
        balance += amount;
        operations.add(new BankOperation(TypeOperation.DEPOSIT,amount));
        return true;
    }

    public boolean doWithdrawal(final double amount) {
        if (balance < amount) {
            return false;
        }
        balance -= amount;
        operations.add(new BankOperation(TypeOperation.WITHDRAWAL,amount));
        return true;
    }

    public double getBalance() {
        return balance;
    }


    public List<BankOperation> getHistory() {
        return operations;
    }
}
