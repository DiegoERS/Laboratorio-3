/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentation;

import Logic.Account;
import java.util.Date;

/**
 *
 * @author Laboratorios
 */
public class TransactionLog { //Bitácora
    
    private int transactionId;
    private String event; //save- withdraw-sinpe-...
    private Date date;
    private Account account;
    private double movement;
    
    private static int consecutive=0;

    public TransactionLog() {
        this.transactionId=++consecutive;
    }

    public TransactionLog(String event, Account account, double movement) {
        this();
        this.date=new Date();
        this.event = event;
        this.account = account;
        this.movement = movement;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getMovement() {
        return movement;
    }

    public void setMovement(double movement) {
        this.movement = movement;
    }

    public static int getConsecutive() {
        return consecutive;
    }

    public static void setConsecutive(int consecutive) {
        TransactionLog.consecutive = consecutive;
    }

    @Override
    public String toString() {
        return "\n GENERAL BANK INFORMATION:" + 
                " \n Event id=" + transactionId + 
                "\n Event Type=" + event + 
                "\n Date=" + date +
                "\n Movement=" + movement+ 
                "\n AffectedAccount=" +account + "\n";
    }
    
    
    
    
}
