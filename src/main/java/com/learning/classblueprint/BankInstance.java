package com.learning.classblueprint;

import java.util.ArrayList;


public class BankInstance {

  final String bankName = "BoFA";
  final String bankType = "Public";
  final ArrayList items =  new ArrayList();

  void getMetaData(){


     items.add("Customer1");
     items.add("Customer2");
     items.add("Customer3");
     items.add("Customer4");

  }
   void displayCustomers() {

     System.out.println(items.toString());


   }


}
