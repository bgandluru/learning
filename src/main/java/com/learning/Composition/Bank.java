package com.learning.Composition;

public class Bank {

  String account = "1234567";
  private ConsumerBanking consumerBanking;
  private CommercialBanking commercialBanking;

  Bank (ConsumerBanking consumerBanking, CommercialBanking commercialBanking) {

    this.commercialBanking = commercialBanking;
    this.commercialBanking.account = account;
    this.consumerBanking = consumerBanking;
    this.consumerBanking.account = account;

  }

  public void display() {

    consumerBanking.getConsumerBanking();
    commercialBanking.getCommercialBanking();

  }

}
