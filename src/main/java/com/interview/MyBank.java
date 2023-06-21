package com.interview;

import com.interview.service.BankService;

/**
 * Hello world!
 *
 */
public class MyBank
{
    public static void main( String[] args )
    {
        BankService bankService = new BankService();
        boolean isOk = bankService.doDeposit(100.0);
        System.out.println("Deposit ok ? " + isOk);
    }
}
