/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.ArrayList;

/**
 *
 * @author Laboratorios
 */
public class CommercialBank {
    
    private String name;
   private double finance;
   private Account[] accounts;

    public CommercialBank(String name, double finance, Account[] accounts) {
        this.name = name;
        this.finance = finance;
        this.accounts = accounts;
    }

    

    public CommercialBank() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    public double getFinance() {
        return finance;
    }

    public void setFinance(double finance) {
        this.finance = finance;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "CommercialBank" + "\n name=" + name + "\n finance=" + finance + "\n account= \n"  ;
    }
   
    
   
    
}
