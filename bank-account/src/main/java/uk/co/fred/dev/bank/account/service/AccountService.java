/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.fred.dev.bank.account.service;

import java.util.List;
import uk.co.fred.dev.bank.account.model.Account;

/**
 *
 * @author DevPC
 */
public interface AccountService {
    
    public Account save(Account account);
    
    public Account findByAccountNo(String accNo);
    
    public List<Account> findAll();
    
    public Account findByID(String id);
}
