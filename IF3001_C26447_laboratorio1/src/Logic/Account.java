/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Laboratorios
 */
public abstract class Account {
    protected String AccountNumber;
    protected Client client;
    protected double balance;

    public Account(String AccountNumber, Client client, double balance) {
        this.AccountNumber = AccountNumber;
        this.client = client;
        this.balance = balance;
    }

    public Account() {
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "ACCOUNT INFORMATION: \n" + "\n Account Number=" + AccountNumber + "\n Account Name=" + client + "\n balance=" + balance+ "\n";
    }
 
   
    
   public abstract double interestCalculation();
   
   public abstract boolean withdraw(double money);
   
   public abstract void deposit(double money);
   
   public boolean sinpeTransactions(Account account, double money){
       boolean verification=this.withdraw(money);
       
       if (verification) {
           account.deposit(money);
           return true;
       }
       return false;
   }
    
   
    
  
    
    
    
    
    
}
