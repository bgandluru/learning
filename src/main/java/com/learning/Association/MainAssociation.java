package com.learning.Association;

import sun.util.resources.cldr.sr.CurrencyNames_sr;


public class MainAssociation {

  public static void main(String args[]){

    Customer customer = new Customer();
    customer.changeBank("bofa");
    customer.addBeneficiary();
    customer.transferAmount();
    customer.receiveNotification();

    customer.changeBank("wells");
    customer.addBeneficiary();
    customer.transferAmount();
    customer.receiveNotification();

  }
}
