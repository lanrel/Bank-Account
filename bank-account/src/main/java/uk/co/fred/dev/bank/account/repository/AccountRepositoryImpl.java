/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.fred.dev.bank.account.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import uk.co.fred.dev.bank.account.factory.AccountFactory;
import uk.co.fred.dev.bank.account.model.Account;

/**
 *
 * @author DevPC
 */
@Component
public class AccountRepositoryImpl implements AccountRepository{
    
     private static final Map ACCOUNTS = new HashMap<String,Account>();
    
    static{
        Account current = AccountFactory.createCurrentAccount("12345678");
        current.setId(String.valueOf(ACCOUNTS.size() + 1));
        current.setBalance(75.0);
        ACCOUNTS.put(current.getAccountNo(), current);
        
        Account savings = AccountFactory.createSavingsAccount("23564825");
        savings.setId(String.valueOf(ACCOUNTS.size() + 1));
        savings.setBalance(350.0);
        ACCOUNTS.put(savings.getAccountNo(), savings);
    }

    @Override
    public Account save(Account account) {
        account.setId(String.valueOf(ACCOUNTS.size() + 1));        
        ACCOUNTS.put(account.getAccountNo(), account);
        return account;
    }

    @Override
    public List<Account> findAll() {
        return new ArrayList<>(ACCOUNTS.values());
    }

    @Override
    public Account find(String id) {
        return findAll().stream().filter(a -> a.getID().equals(id)).findAny().get();
    }

    @Override
    public Account findByAccNo(String accountNo) {
        return (Account)ACCOUNTS.get(accountNo);
    }
    
}
