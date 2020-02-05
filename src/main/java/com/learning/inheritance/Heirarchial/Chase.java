package com.learning.inheritance.Heirarchial;

public class Chase extends AbstractBank {

  @Override
  public boolean transferFunds() {
    System.out.println("TRANSFERRED funds as Chase way");
    return true;
  }

  @Override
  public double withdrawFunds() {
    System.out.println("Withdraw funds as Chase way");
    return 1000.0;
  }

  @Override
  public boolean depositFunds() {
    System.out.println("deposit funds as Chase way");
    return true;

  }
}
