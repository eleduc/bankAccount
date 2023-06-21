package com.interview.bank;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount bankAccount;

    @Test
    public void doDeposit() {
        bankAccount = new BankAccount(50.0);
        bankAccount.doWithdrawal(50.0);
        assertEquals(bankAccount.getBalance(),0.0);
    }

    @Test
    public void doWithDrawal_all() {
        bankAccount = new BankAccount(50.0);
        bankAccount.doWithdrawal(50.0);
        assertEquals(bankAccount.getBalance(),0);
    }

    @Test
    public void doWithDrawal_notEnoughMoney(){
        bankAccount = new BankAccount(25.0);
        bankAccount.doWithdrawal(50.0);
        assertEquals(bankAccount.getBalance(),25.0);
    }

    @Test
    public void getOperations() {
        bankAccount = new BankAccount(25.0);
        bankAccount.doDeposit(100.0);
        bankAccount.doWithdrawal(50.0);
        List<BankOperation> operations = bankAccount.getHistory();
        assertEquals(operations.size(),2);
    }
}