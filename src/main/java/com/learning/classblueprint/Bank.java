package com.learning.classblueprint;
import java.util.ArrayList;

public class Bank {

  static final String bankType;
  static final ArrayList banks;

  static {

    bankType = "Public";
    banks = new ArrayList();
              banks.add("Bank Of America");
              banks.add("Wellsfargo");
              banks.add("US Bank");
              banks.add("Chase");
              banks.add("Citi");

   }

   public static void getbanks(){

     System.out.println(bankType);
     System.out.println(banks.toString());

   }

}
