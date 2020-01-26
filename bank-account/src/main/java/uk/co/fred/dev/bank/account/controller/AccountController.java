/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.fred.dev.bank.account.controller;

import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import uk.co.fred.dev.bank.account.model.Account;
import uk.co.fred.dev.bank.account.service.AccountService;

/**
 *
 * @author DevPC
 */
@RestController
public class AccountController {
    
    @Autowired
    private AccountService accountService;
    
    @RequestMapping(value = "/account/{accNo}", method = RequestMethod.GET)
    public @ResponseBody Account findByAccountNumber(@PathVariable("accNo") String accNo){
        return accountService.findByAccountNo(accNo);
    }
    
    @RequestMapping(value = "/account", method = RequestMethod.GET)
    public @ResponseBody List<Account> findAll(){
        return accountService.findAll();
    }
    
    //post is the method to create - this method should be to help create an account.
    @RequestMapping(value = "/account", method = RequestMethod.POST)
    public @ResponseBody Account CreateAccount(@RequestBody Account account)
    {
        return accountService.save(account);
    }
    
}
