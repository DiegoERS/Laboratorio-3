/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Diego
 */
public class CentralBank {

    private CommercialBank[] commercialBanks;

    public CentralBank(CommercialBank[] commercialBanks) {
        this.commercialBanks = commercialBanks;
    }

    public CentralBank() {
    }

    public CommercialBank[] getCommercialBanks() {
        return commercialBanks;
    }

    public void setCommercialBanks(CommercialBank[] commercialBanks) {
        this.commercialBanks = commercialBanks;
    }

    public void mobileSinpe(Account issuerAccount, String phone, double amount) {
        String info = "THE SINPE WAS MADE BY THE FOLLOWING ACCOUNT: \n";
        Account transmitter = null;
        Account receiver = null;
        for (int i = 0; i < this.commercialBanks.length; i++) {
            if (this.commercialBanks[i] != null) {
                for (int j = 0; j < this.commercialBanks[i].getAccounts().length; j++) {
                    if (this.commercialBanks[i].getAccounts()[j] != null) {
                        if (this.commercialBanks[i].getAccounts()[j].getAccountNumber().equals(issuerAccount.getAccountNumber())) {
                            info += this.commercialBanks[i];
                            info += issuerAccount + "\n";
                            transmitter = issuerAccount;
                            break;

                        }
                    }

                }
            }

        }
        info += " \n \n \n IT WAS MADE OF THE FOLLOWING BANK ACCOUNT: \n";

        if (transmitter != null) {
            for (int i = 0; i < this.commercialBanks.length; i++) {
                if (this.commercialBanks[i] != null) {
                    for (int j = 0; j < this.commercialBanks[i].getAccounts().length; j++) {
                        if (this.commercialBanks[i].getAccounts()[j] != null) {
                            if (this.commercialBanks[i].getAccounts()[j].getClient().getPhone().equals(phone)) {
                                info += this.commercialBanks[i];
                                info += this.commercialBanks[i].getAccounts()[j];
                                receiver = this.commercialBanks[i].getAccounts()[j];
                                break;

                            }
                        }

                    }
                }

            }

            if (receiver != null) {
                
                if (transmitter.sinpeTransactions(receiver, amount)) {
                    System.out.println("\n \n \n THIS SINPE IS FOR : " + transmitter.getClient().getName()+
                                        "\n FROM : "+ receiver.getClient().getName()+
                                         "\n IT IS AN AMOUNT OF : "+ amount + " COLONES. \n \n");
                    System.out.println(info);
                }
            } else {
                System.out.println("THERE ISN'T ACCOUNT WITH THE GIVEN NUMBER");
            }
        } else {
            System.out.println("THERE ISNT BANK WITH THIS AFFILIATED ACCOUNT");
        }

    }

}
