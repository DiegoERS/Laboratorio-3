/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentation;

import Logic.Account;
import Logic.CentralBank;
import Logic.Client;
import Logic.CommercialBank;
import Logic.CurrentAccount;
import Logic.SavingAccount;
import java.util.Date;

/**
 *
 * @author Laboratorios
 */
public class TransactionLogTest {

    public TransactionLogTest() {
    }
    
    public void test(){
        Client clients[]=new Client[10];
        clients [0]=new Client("304040404", "Luis", "Turricity", "82828282");
        clients [1]=new Client("703100510", "Diego", "Limon", "84210914");
        clients [2]=new Client("709100710", "Ema", "Guacimo", "84210919");
        clients [3]=new Client("111111111", "Alejandro", "Jimenez", "86650012");
        
        
        
        Date date= new Date(2022,3,1);
        float currentInterest= (float)0.02;
        
        Account accounts[]= new Account[10];
        accounts[0]=new SavingAccount( date,12, currentInterest, "1", clients[0], 1000000);
        accounts[1]=new CurrentAccount(currentInterest, "2", clients[1], 50);
        
        
         Account accounts2[]= new Account[10];
        accounts2[0]=new CurrentAccount(currentInterest, "3", clients[2], 5550);
        accounts2[1]=new SavingAccount( date,12, currentInterest, "4", clients[3], 1000000);
        
        CommercialBank commercialBanks[]=new CommercialBank[2];
        commercialBanks[0]=new CommercialBank("BAC San jose", 100000, accounts);
        commercialBanks[1]=new CommercialBank("Banco de Costa Rica", 9999999, accounts2);
        
        CentralBank centralBank=new CentralBank(commercialBanks);
        TransactionLog tl[]= new TransactionLog[5];
       accounts[0].withdraw(250000);
       accounts[1].deposit(2500);
       
       
       centralBank.mobileSinpe(accounts2[0], "84210914", 5550);
       
       tl[0]=new TransactionLog("WithDraw", accounts[0], 250000);
       tl[1]=new TransactionLog("Deposit", accounts[1], 2500);
       
       
       tl[2]=new TransactionLog("Sinpe issuer", accounts2[0], 5550);
       tl[3]=new TransactionLog("Sinpe receiver", accounts[1], 5550);
       
        for (int i = 0; i < tl.length; i++) {
            if (tl[i]!=null) {
                System.out.println(tl[i]);
            }
            
        }
       
        
    }
    
    
    
    
}
