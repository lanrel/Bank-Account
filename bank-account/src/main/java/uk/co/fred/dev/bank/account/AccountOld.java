/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.fred.dev.bank.account;

/**
 *
 * @author DevPC
 */
public class AccountOld {
    
    private double balance;
    // set balace to 0.0
    public double Account(){
        balance = 0.0;
        return balance;
    }
    //create Deposit
    public void deposit(double amount){
    balance = balance + amount;
    }
    //create Withdrawal
    public void withdraw(double amount){
    balance = balance - amount;
    }
    //create getBalance
    public double getBalance(){
    return balance;
    }
    
}
