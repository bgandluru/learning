package com.learning.Composition;

public class MainComposition {
  public static void main(String args[]){

    Bank bank = new Bank(new ConsumerBanking(),new CommercialBanking());
    bank.display();

  }
}
