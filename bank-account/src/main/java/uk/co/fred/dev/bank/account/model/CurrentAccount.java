/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.fred.dev.bank.account.model;

/**
 *
 * @author DevPC
 */
public class CurrentAccount extends Account{
    
    private static final String TYPE = "CURRENT";

    public CurrentAccount(String accountNo) {
        this.setAccountNo(accountNo);
        this.setType(TYPE);
    }  
}
