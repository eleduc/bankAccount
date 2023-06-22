package com.interview.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankOperationTest {

    @Test
    public void checkDepositOperation() {
        BankOperation bankOperation = new BankOperation(TypeOperation.DEPOSIT,50);
        assertEquals(TypeOperation.DEPOSIT, bankOperation.getType());
        assertEquals(50.0,bankOperation.getAmount(), 0.1);
    }

    @Test
    public void checkWithdrawalOperation() {
        BankOperation bankOperation = new BankOperation(TypeOperation.WITHDRAWAL,23);
        assertEquals(TypeOperation.WITHDRAWAL,bankOperation.getType());
        assertEquals(23.0,bankOperation.getAmount(), 0.1);

    }

}