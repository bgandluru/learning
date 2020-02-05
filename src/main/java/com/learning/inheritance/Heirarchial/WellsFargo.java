package com.learning.inheritance.Heirarchial;

public class WellsFargo extends AbstractBank {

  @Override
  public boolean transferFunds() {
    System.out.println("TRANSFERRED funds as WellsFargo way");
    return true;
  }

  @Override
  public double withdrawFunds() {
    System.out.println("Withdraw funds as WellsFargo way");
    return 1000.0;
  }

  @Override
  public boolean depositFunds() {
    System.out.println("deposit funds as WellsFargo way");
    return true;

  }
}
