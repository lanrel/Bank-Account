/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.fred.dev.bank.account.service;

/**
 *
 * @author DevPC
 */
public interface TransactionService {
    
    public Double deposit(Double amount, String accountNo);
    
    public Double withdraw(Double withdrawingAmount, String accountNo);
    
}
