package com.learning.NestedClasses.InnerClasses;

public class Bank {

      int value = 20;
      private class Bofa {
    private int innerValue = 40;
       void display() {
         System.out.println("Bank Of america inner "+value);
       }
     private class BofaFin{
      void display() {
        System.out.println("Bank Of america inner "+value);
      }
    }
  }

   void dispaly() {
    System.out.println("Bank Of america outer");
     new Bofa().display();
     new Bofa().new BofaFin().display();
   }

}
