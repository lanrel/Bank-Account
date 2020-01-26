/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.fred.dev.bank.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uk.co.fred.dev.bank.account.factory.AccountFactory;
import uk.co.fred.dev.bank.account.manager.AccountManager;
import uk.co.fred.dev.bank.account.manager.TransactionManager;
import uk.co.fred.dev.bank.account.model.Account;
import uk.co.fred.dev.bank.account.service.AccountService;
import uk.co.fred.dev.bank.account.service.TransactionService;

/**
 *
 * @author DevPC
 */
@SpringBootApplication
public class BankMain {
    
    public static void main(String[] args){
        SpringApplication.run(BankMain.class, args);
        
//        AccountService service = new AccountManager();
//        
//        Account current = AccountFactory.createCurrentAccount("30045678");
//        System.out.println("Account no: " + current.getAccountNo());
//        System.out.println("Account type: " + current.getType());
//        System.out.println("Account balance: " + current.getBalance());
//        service.save(current);
//        
////        Account savings = AccountFactory.createSavingsAccount("23564825");
////        System.out.println("Account no: " + savings.getAccountNo());
////        System.out.println("Account type " +  savings.getType());
////        System.out.println("Account balance: " + savings.getBalance());
////        service.save(savings);
//        
//        System.out.println("Calling Service");
//        System.out.println(service.findByAccountNo("12345678"));
//        System.out.println("Calling service");
//        System.out.println(service.findByAccountNo("23564825"));
//        
//        System.out.println(service.findAll());
//        
//        System.out.println("Account found: " + service.findByID("2"));
//        
//        TransactionService transService = new TransactionManager();
//        
//        System.out.println("Current balance: " + service.findByAccountNo("12345678").getBalance());
//        try{
//            transService.deposit(50.0, "1234567");
//            System.out.println("New balance: " + service.findByAccountNo("12345678").getBalance());
//
//            System.out.println("Current balance: " + service.findByAccountNo("23564825").getBalance());
//        
//            System.out.println("Balance after: " + transService.withdraw(450.0, "23564825"));
//        }catch(RuntimeException e){
//            System.err.println(e.getMessage());
//        }
//        System.out.println("New balance: " + service.findByAccountNo("23564825").getBalance());
        
        
//    AccountOld cust1 = new AccountOld(); //Creating an account object4
//    cust1.deposit(500);
//    
//    AccountOld cust2 = new AccountOld(); // Creating an account object2
//    cust2.deposit(400);
//    
//    cust1.withdraw(200);
//    
//    cust2.withdraw(150);
//    
//    System.out.println("Customer one Account Balance is");
//    System.out.println(cust1.getBalance());
//    System.out.println("Customer two Account Balance is");
//    System.out.println( cust2.getBalance());
   
    
    
    
}
    
}
