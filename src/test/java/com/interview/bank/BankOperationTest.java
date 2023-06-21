package com.interview.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankOperationTest {

    @Test
    public void checkDepositOperation() {
        BankOperation bankOperation = new BankOperation(TypeOperation.DEPOSIT,50);
        assertEquals(bankOperation.getType(), TypeOperation.DEPOSIT);
    }

    @Test
    public void checkWithDrawalOperation() {
        BankOperation bankOperation = new BankOperation(TypeOperation.WITHDRAWAL,50);
        assertEquals(bankOperation.getType(), TypeOperation.WITHDRAWAL);
    }

}