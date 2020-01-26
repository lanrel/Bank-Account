/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.fred.dev.bank.account.manager;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.fred.dev.bank.account.model.Account;
import uk.co.fred.dev.bank.account.repository.AccountRepository;
import uk.co.fred.dev.bank.account.service.AccountService;

/**
 *
 * @author DevPC
 */
@Service
public class AccountManager implements AccountService{
    
   @Autowired
   private AccountRepository repository;

    @Override
    public Account save(Account account) {
        if(account == null){
            return null;
        }
        return repository.save(account);
    }

    @Override
    public Account findByAccountNo(String accNo) {
        return repository.findByAccNo(accNo);
    }

    @Override
    public List<Account> findAll() {
        return repository.findAll();
    } 
    
     @Override
    public Account findByID(String id) {
        return repository.find(id);
    }    
    
}
