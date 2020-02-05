package com.learning.inheritance.multiple;

public class BoFA implements GenericBank {

  void getVariables(){
    System.out.println(BoFA.BankName);
    System.out.println(BoFA.BankType);
       getDeposits();
  }

}
