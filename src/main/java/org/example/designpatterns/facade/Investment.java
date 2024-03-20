package org.example.designpatterns.facade;

import java.math.BigDecimal;

public class Investment implements IAccount {
    BigDecimal totalAmount;
    int accountNumber;
    public Investment(BigDecimal initAmount){
        this.totalAmount=initAmount;
    }
    @Override
    public void deposit(BigDecimal amount) {
        
    }

    @Override
    public void withdraw(BigDecimal amount) {

    }

    @Override
    public void transfer(BigDecimal amount) {

    }

    @Override
    public int getAccountNumber() {
        return this.hashCode();
    }
    @Override
    public void addAmount(BigDecimal amount) {
        totalAmount= totalAmount.add(amount);
    }

    @Override
    public void substractAmount(BigDecimal amount) {
        totalAmount=totalAmount.subtract(amount);
    }
    @Override
    public BigDecimal getTotalAmount(){
        return this.totalAmount;
    }
}
