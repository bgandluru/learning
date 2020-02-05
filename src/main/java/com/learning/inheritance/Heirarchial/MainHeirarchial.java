package com.learning.inheritance.Heirarchial;

public class MainHeirarchial {

  public static void main(String args[]) {

    Bank bofa = new BankOfAmerica();

    System.out.println(bofa.getBalance());
    System.out.println(bofa.getAccountInfo());
    System.out.println(bofa.withdrawFunds());
    bofa.getDeposits();

    System.out.println(Bank.bankAuthority);
    System.out.println(Bank.bankControlBy);

  }

}
