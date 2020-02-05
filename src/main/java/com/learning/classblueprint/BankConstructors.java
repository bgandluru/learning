package com.learning.classblueprint;

public class BankConstructors {


   String bankType;
   String bankName;
  BankConstructors() {}
  BankConstructors(String bankType,String bankName) {

    this.bankName = bankName;
    this.bankType = bankType;

  }


  void displayDetails() {

    System.out.println("Bank Type : " +bankType);
    System.out.println("Bank Name : " +bankName);

  }


}
