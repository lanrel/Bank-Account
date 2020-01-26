/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.fred.dev.bank.account.repository;

import java.util.List;
import uk.co.fred.dev.bank.account.model.Account;

/**
 *
 * @author DevPC
 */
public interface AccountRepository {
    
    public Account save(Account account);
    
    public List<Account> findAll();
    
    public Account find(String id);
    
    public Account findByAccNo(String accountNo);
}
