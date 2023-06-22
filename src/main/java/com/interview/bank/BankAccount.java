
package com.interview.bank;

import java.util.ArrayList;
import java.util.List;

/**
 * This class define what is a bank account.
 * It stores the current balance and the history of the operations done
 */
public class BankAccount {

    private double balance;
    private final List<BankOperation> history;

    public BankAccount(final double initialAmount) {
        balance = initialAmount;
        history = new ArrayList<>();
    }

    public boolean doDeposit(final double amount) {
        if (amount < 0) {
            return false;
        }
        balance += amount;
        history.add(new BankOperation(TypeOperation.DEPOSIT,amount));
        return true;
    }

    public boolean doWithdrawal(final double amount) {
        if (amount < 0 || balance < amount) {
            return false;
        }
        balance -= amount;
        history.add(new BankOperation(TypeOperation.WITHDRAWAL,amount));
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public List<BankOperation> getHistory() {
        return history;
    }
}
