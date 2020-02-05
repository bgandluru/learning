package com.learning.inheritance.multiple;

public interface Globalbank {

  String BankName = "GLOBALBANK";

  String getAccountInfo();
  String getCustomerInfo();
  boolean depositFunds();


  default void getDeposits(){
    System.out.println("Get deposits GlobalBank");
  }


}
