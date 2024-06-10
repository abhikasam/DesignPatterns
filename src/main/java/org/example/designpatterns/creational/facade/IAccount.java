package org.example.designpatterns.creational.facade;

import java.math.BigDecimal;

public interface IAccount {

    void deposit(BigDecimal amount);
    void withdraw(BigDecimal amount);
    void transfer(BigDecimal amount);
    int getAccountNumber();
    void addAmount(BigDecimal amount);
    void substractAmount(BigDecimal amount);
    BigDecimal getTotalAmount();
}
