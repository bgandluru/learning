package com.learning.classblueprint;

import java.util.ArrayList;


public class BankStaticInstance {

  String bankType = "Public";
  static ArrayList banks;
  static {
    banks = new ArrayList();
    banks.add("Bank Of America");
    banks.add("Wellsfargo");
    banks.add("US Bank");
    banks.add("Chase");
    banks.add("Citi");

  }

  public static void displayStaticWay(){



    System.out.println("Static Way :"+banks.toString());
  }


  public void displayBanks(){
      System.out.println("Instance way :"+banks.toString());
  }


}





