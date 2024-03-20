package org.example.designpatterns;

import org.example.designpatterns.facade.BankService;
import org.example.designpatterns.facade.IAccount;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class FacadeDpTest {
    @Test
    public void Test(){
        BankService bankService=new BankService();
        int savingsAccount=bankService.createNewAccount("savings",new BigDecimal(1500));
        int chequingAccount=bankService.createNewAccount("chequing",new BigDecimal(1500));
        bankService.transferMoney(savingsAccount,chequingAccount,new BigDecimal(500));
        System.out.println("money in savings : "+bankService.getTotalAmount(savingsAccount));
        System.out.println("money in chequings : "+bankService.getTotalAmount(chequingAccount));
    }
}
