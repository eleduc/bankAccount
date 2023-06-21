package com.interview;

import com.interview.bank.BankAccount;
import com.interview.service.BankService;

/**
 * Bank application
 */
public class MyBank
{
    public static void main( String[] args )
    {
        BankService bankService = new BankService();
        BankAccount bankAccount = new BankAccount(0);
        boolean isOk = bankService.doDeposit(bankAccount, 100.0);
        System.out.println("Deposit ok ? " + isOk);
        isOk = bankService.doWithdrawal(bankAccount, 150.0);
        System.out.println("Withdrawal ok ? " + isOk);
        isOk = bankService.doWithdrawal(bankAccount, 50.0);
        System.out.println("Withdrawal ok ? " + isOk);
        System.out.println("Balance : " + bankAccount.getBalance());
        System.out.println("Operations : " + bankAccount.getHistory().toString());
    }
}
