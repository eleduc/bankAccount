package com.interview.service;
import com.interview.bank.BankAccount;
import com.interview.bank.BankOperation;
import com.interview.bank.TypeOperation;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankServiceTest {

    private static BankService bankService;

    @BeforeAll
    public static void setup() {
        bankService = new BankService();
    }

    @Test
    public void doDeposit() {
        BankAccount bankAccount = new BankAccount(0);
        boolean result = bankService.doDeposit(bankAccount, 100.0);
        assertTrue(result);
    }

    @Test
    public void doWithdrawal_notEnoughMoney() {
        BankAccount bankAccount = new BankAccount(50);
        boolean result = bankService.doWithdrawal(bankAccount, 100.0);
        assertFalse(result);
    }

    @Test
    public void doWithdrawal_EnoughMoney() {
        BankAccount bankAccount = new BankAccount(100.0);
        boolean result = bankService.doWithdrawal(bankAccount, 100.0);
        assertTrue(result);
    }

    @Test
    public void checkHistory() {
        BankAccount bankAccount1 = new BankAccount(100.0);
        BankAccount bankAccount2 = new BankAccount(200.0);
        bankService.doWithdrawal(bankAccount1,25.0);
        bankService.doDeposit(bankAccount2,25.0);

        List<BankOperation> op1 = bankService.getHistory(bankAccount1);
        List<BankOperation> op2 = bankService.getHistory(bankAccount2);

        assertEquals(1,op1.size());
        BankOperation account1op = op1.get(0);
        assertEquals(TypeOperation.WITHDRAWAL, account1op.getType());
        assertEquals(1, op2.size());
        BankOperation account2op = op2.get(0);
        assertEquals(TypeOperation.DEPOSIT, account2op.getType());
    }

}