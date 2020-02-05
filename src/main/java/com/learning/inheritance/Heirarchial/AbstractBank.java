package com.learning.inheritance.Heirarchial;

public abstract class AbstractBank implements Bank {


  public String getAccountInfo(){
    return "12345"+"SAVINGS"+"1000"+"5654231";
  }
  public String getCustomerInfo(){
    return "JOHN"+"2341"+"SYNNYVALE"+"987645343";
  }
  public double getBalance(){
    return 2000.00;
  }

  public boolean depositFunds(){
    return false;
  };
  public double withdrawFunds(){
    return 0.0;
  };
  public boolean transferFunds(){
    return false;
  };

}

