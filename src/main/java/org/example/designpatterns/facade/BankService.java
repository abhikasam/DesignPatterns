package org.example.designpatterns.facade;

import java.math.BigDecimal;
import java.util.Hashtable;

public class BankService {
    private Hashtable<Integer,IAccount> bankAccounts;
    public BankService(){
        bankAccounts=new Hashtable<>();
    }
    public int createNewAccount(String type, BigDecimal initAmount){
        IAccount account=null;
        if(type.equals("chequing"))
            account=new Chequing(initAmount);
        else if(type.equals("savings"))
            account=new Saving(initAmount);
        else if(type.equals("investment"))
            account=new Investment(initAmount);
        else{
            System.out.println("invalid choice");
        }
        if(account!=null){
            bankAccounts.put(account.hashCode(),account);
            return account.getAccountNumber();
        }
        return -1;
    }
    public void transferMoney(int from,int to,BigDecimal money){
        IAccount fromAccount=bankAccounts.get(from);
        IAccount toAccount=bankAccounts.get(to);
        fromAccount.substractAmount(money);
        toAccount.addAmount(money);
    }
    public BigDecimal getTotalAmount(int accountNumber){
        IAccount account=bankAccounts.get(accountNumber);
        return account.getTotalAmount();
    }
}
