/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.fred.dev.bank.account.model;

import java.io.Serializable;

/**
 *
 * @author DevPC
 */

public abstract class Account implements Serializable{
    private String accountNo;
    private String type;
    private Double balance = 0.0;
    private String id;
    
    public String getID(){
    return id;
    }
    public void setId(String id){
    this.id = id;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }   
    
    @Override
    public String toString(){
        return "{accountNO: ".concat(accountNo).concat(", ")
                .concat("type: ").concat(type).concat(", ")
                .concat("id: ").concat(id).concat(", ")
                .concat("balance: ").concat(balance +"}");
    }
    
}
