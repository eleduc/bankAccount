package com.interview.service;
import com.interview.bank.BankAccount;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

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

}