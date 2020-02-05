package com.learning.Association;

public class Customer {

  Bank bank;
  String bankName;

   void changeBank(String bankName){
    this.bankName = bankName;
    if(bankName.equals("bofa")){
      bank = new Bofa();
    } else if(bankName.equals("wells")){
       bank = new Wellsfargo();
    }
  }


  void addBeneficiary(){
    bank.storeBeneficiary("John",763432524);
  }

  void transferAmount(){
    bank.sendAmount( 4000.00,763432524);

  }

  void receiveNotification() {

    String status = bank.getNotificaton();

     System.out.println("Amount Transfer "+status);

  }




}
