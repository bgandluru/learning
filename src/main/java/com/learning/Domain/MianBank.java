package com.learning.Domain;

public class MianBank {

  public static void main(String args[]){

    Bank bank = new Bank();
    Customer customer = bank.getCustomerInfo();
    Customer customer1 = customer;

    System.out.println(customer.equals(customer1));

  }
}
