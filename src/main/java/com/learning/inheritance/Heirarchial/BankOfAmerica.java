package com.learning.inheritance.Heirarchial;

public class BankOfAmerica extends AbstractBank {

  @Override
  public boolean transferFunds() {

    System.out.println("TRANSFERRED funds as BoFA way");

    return true;
  }

  @Override
  public double withdrawFunds() {
    System.out.println("Withdraw funds as BoFA way");

    return 1000.0;
  }

  @Override
  public boolean depositFunds() {
    System.out.println("deposit funds as BoFA way");

    return true;

  }

  @Override
  public String getCustomerInfo() {
    return super.getCustomerInfo();
  }
}
