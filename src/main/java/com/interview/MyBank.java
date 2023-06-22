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
        BankAccount bankAccount1 = new BankAccount(100);
        BankAccount bankAccount2 = new BankAccount(0);
        BankAccount bankAccount3 = new BankAccount(200);
        System.out.println("Balance on bankAccount1: " + bankAccount1.getBalance());
        bankService.doDeposit(bankAccount1, 100.0);
        System.out.println("Balance on bankAccount1: " + bankAccount1.getBalance());
        System.out.println("Withdrawal bankAccount2 is ok ? " + bankService.doWithdrawal(bankAccount2,50));
        System.out.println("Balance on bankAccount2: " + bankAccount2.getBalance());
        bankService.doDeposit(bankAccount2, 100.0);
        System.out.println("Withdrawal bankAccount2 is ok ? " + bankService.doWithdrawal(bankAccount2,50));
        System.out.println("Balance on bankAccount2: " + bankAccount2.getBalance());
        System.out.println("Balance on bankAccount3: " + bankAccount3.getBalance());
        System.out.println("Withdrawal bankAccount3 is ok ? " + bankService.doWithdrawal(bankAccount3,50));
        System.out.println("Balance on bankAccount3: " + bankAccount3.getBalance());
        System.out.println(bankService.getHistory(bankAccount1).toString());
        System.out.println(bankService.getHistory(bankAccount2).toString());
        System.out.println(bankService.getHistory(bankAccount3).toString());
    }
}
