package com.learning.inheritance.multiple;

public interface Bank {

  String BankType = "NationalBank";

  double withdrawFunds();
  double getBalance();
  boolean transferFunds();

  default void getDeposits(){
    System.out.println("Get deposits National bank");
  }


}
