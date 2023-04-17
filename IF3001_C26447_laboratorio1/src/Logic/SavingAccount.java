/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.Date;

/**
 *
 * @author Laboratorios
 */
public class SavingAccount extends Account{

    private Date date;
    private int monthlyTerm;
    private float interest;

    public SavingAccount(Date date, int monthlyTerm, float interest, String AccountNumber, Client client, double balance) {
        super(AccountNumber, client, balance);
        this.date = date;
        this.monthlyTerm = monthlyTerm;
        this.interest = interest;
    }

    public SavingAccount(Date date, int monthlyTerm, float interest) {
        this.date = date;
        this.monthlyTerm = monthlyTerm;
        this.interest = interest;
    }

    public SavingAccount() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMonthlyTerm() {
        return monthlyTerm;
    }

    public void setMonthlyTerm(int monthlyTerm) {
        this.monthlyTerm = monthlyTerm;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return super.toString()+ 
                "\n SAVING ACCOUNT DETAILS: \n" + 
                "\n monthly Term=" + monthlyTerm +
                "\n Saving StartDate=" + date + 
                "\n interest=" + interest + 
                "\n Balance + interest="+ interestCalculation();
    }
    
    

    @Override
    public double interestCalculation() {
        double totalInterests;
        
        totalInterests=this.monthlyTerm*this.interest*this.balance;
        
        return this.balance+totalInterests;
    }

    @Override
    public boolean withdraw(double money) {
        if (money>this.balance) {
            System.out.println("YOU DON'T HAVE ENOUGH MONEY");
            return false;
        }else{
        this.balance=this.balance-money;
        System.out.println(money+" HAS BEEN WITHDRAWN");
        return true;
        }
    }

    @Override
    public void deposit(double money) {
        System.out.println(money+" HAS BEEN DEPOSITED");
        this.balance+=money;
    }

    
    
    
    
    
    
    
    
    
    
    
}
