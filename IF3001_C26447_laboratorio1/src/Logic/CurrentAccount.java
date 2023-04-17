/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Diego
 */
public class CurrentAccount extends Account {

    private float interest;

    public CurrentAccount(float interest, String AccountNumber, Client client, double balance) {
        super(AccountNumber, client, balance);
        this.interest = interest;
    }

    public CurrentAccount(float interest) {
        this.interest = interest;
    }

    public CurrentAccount() {
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }
    
    
    
    
    @Override
    public double interestCalculation() {
       double totalInterests;
        
        totalInterests=(this.balance*this.interest)/12;
        
        return this.balance+totalInterests;
    }

    @Override
    public boolean withdraw(double money) {
       if (money>this.balance) {
            System.out.println("YOU DON'T HAVE ENOUGH MONEY");
            return false;
        }else{
        this.balance=this.balance-money;
        System.out.println(money+" HAS BEEN WITHDRAWN ");
        return true;
        }
    }

    @Override
    public void deposit(double money) {
        System.out.println(money+" HAS BEEN DEPOSITED");
        this.balance+=money;
    }
    
    @Override
    public String toString() {
        return super.toString()+ 
                "\n CURRENT ACCOUNT DETAILS: \n" +  
                "\n interest=" + interest + 
                "\n Balance + interest="+ interestCalculation();
    }
    
}
