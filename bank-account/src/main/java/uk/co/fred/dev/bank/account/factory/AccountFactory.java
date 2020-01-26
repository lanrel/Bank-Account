/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.fred.dev.bank.account.factory;

import uk.co.fred.dev.bank.account.model.Account;
import uk.co.fred.dev.bank.account.model.CurrentAccount;
import uk.co.fred.dev.bank.account.model.SavingsAccount;

/**
 *
 * @author DevPC
 */
public class AccountFactory {
    
    public static Account createCurrentAccount(String no){
        CurrentAccount account = new CurrentAccount(no);
        return account;
    }
    
     public static Account createSavingsAccount(String no){
        SavingsAccount account = new SavingsAccount(no);
        return account;
    }    
}
