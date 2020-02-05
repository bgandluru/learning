package com.learning.inheritance.Heirarchial;

public interface Bank {

  String bankAuthority = "GLOBALBANK";
  String bankControlBy = "USAGOV";

  String getAccountInfo();
  String getCustomerInfo();
  boolean depositFunds();
  double withdrawFunds();
  double getBalance();
  boolean transferFunds();

  default void getDeposits(){
    System.out.println("Get deposits");
  }

}
