package com.interview.service;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BankServiceTest {

    private static BankService bankService;

    @BeforeAll
    public static void setup() {
        bankService = new BankService();
    }

    @Test
    public void doDeposit() {
        boolean result = bankService.doDeposit(100.0);
        assertTrue(result);
    }

}