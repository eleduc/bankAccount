package com.interview.bank;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
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
   public void doDeposit_negativeAmountIsForbidden() {
        bankAccount = new BankAccount(540.0);
        assertFalse(bankAccount.doDeposit(-100.0));
    }

    @Test
    public void doWithdrawal_negativeAmountIsForbidden() {
        bankAccount = new BankAccount(100);
        assertFalse(bankAccount.doWithdrawal(-50));
    }
    @Test
    public void doWithDrawal_all() {
        bankAccount = new BankAccount(50.0);
        bankAccount.doWithdrawal(50.0);
        assertEquals(bankAccount.getBalance(),0);
    }

    @Test void getBalanceAfterDeposit() {
        bankAccount = new BankAccount(0);
        bankAccount.doDeposit(10);
        assertEquals(10.0,bankAccount.getBalance(),0.1);
    }

    @Test void getBalanceAfterWithdrawal() {
        bankAccount = new BankAccount(30);
        bankAccount.doWithdrawal(10);
        assertEquals(20.0,bankAccount.getBalance(),0.1);
    }

    @Test
    public void doWithDrawal_notEnoughMoney(){
        bankAccount = new BankAccount(25.0);
        boolean isOk = bankAccount.doWithdrawal(50.0);
        assertFalse(isOk);
        assertEquals(bankAccount.getBalance(),25.0);
    }

    @Test
    public void getOperations() {
        bankAccount = new BankAccount(25.0);
        LocalDateTime localDate1 = LocalDateTime.now();
        bankAccount.doDeposit(100.0);
        LocalDateTime localDate2 = LocalDateTime.now();
        bankAccount.doWithdrawal(50.0);
        List<BankOperation> operations = bankAccount.getHistory();
        assertEquals(operations.size(),2);
        BankOperation op1 = operations.get(0);
        assertEquals(100.0,op1.getAmount());
        assertEquals(TypeOperation.DEPOSIT, op1.getType());
        LocalDateTime op1Date = op1.getLocalDateTime();
        assertTrue( (op1Date.isAfter(localDate1) || op1Date.isEqual(localDate1)) && (op1Date.isBefore(localDate2) || op1Date.isEqual(localDate2)));
        BankOperation op2 = operations.get(1);
        assertEquals(50.0,op2.getAmount());
        assertEquals(TypeOperation.WITHDRAWAL, op2.getType());
        LocalDateTime op2Date = op2.getLocalDateTime();
        LocalDateTime now = LocalDateTime.now();
        assertTrue((op2Date.isAfter(localDate2) || op2Date.isEqual(localDate2)) && (op2Date.isBefore(now) || op2Date.isEqual(now)));
    }
}