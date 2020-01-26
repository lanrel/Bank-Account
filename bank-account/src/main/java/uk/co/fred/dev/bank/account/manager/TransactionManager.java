/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.fred.dev.bank.account.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.fred.dev.bank.account.model.Account;
import uk.co.fred.dev.bank.account.repository.AccountRepository;
import uk.co.fred.dev.bank.account.service.TransactionService;

/**
 *
 * @author DevPC
 */
@Service
public class TransactionManager implements TransactionService{
    
    @Autowired
    private AccountRepository repository;

    @Override
    public Double deposit(Double amount, String accountNo) {
        Account acc = repository.findByAccNo(accountNo);
        if(acc == null){
            throw new RuntimeException("Account " + accountNo + " does not exist");
        }
        acc.setBalance(acc.getBalance() + amount);
        return acc.getBalance();
    }

    @Override
    public Double withdraw(Double withdrawingAmount, String accountNo) {
        Account acc = repository.findByAccNo(accountNo);
        if(acc == null){
            throw new RuntimeException("Account " + accountNo + " does not exist");
        }else if(acc.getBalance() < withdrawingAmount)
        {
            throw new RuntimeException("You have insuffient fund");
        
        }else{        
            Double remainingBalance =  acc.getBalance() - withdrawingAmount;
            acc.setBalance(remainingBalance);
        }
       return acc.getBalance();
    }
    
}
