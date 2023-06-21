package com.interview.service;

import com.interview.bank.BankAccount;
import com.interview.bank.BankOperation;

import java.util.List;

public class BankService {

    public boolean doDeposit(final BankAccount account, final double amount) {
        return account.doDeposit(amount);
    }

    public boolean doWithdrawal(final BankAccount account, final double amount) {
        return account.doWithdrawal(amount);
    }

    public List<BankOperation> getHistory(final BankAccount account) {
        return account.getHistory();
    }
}
