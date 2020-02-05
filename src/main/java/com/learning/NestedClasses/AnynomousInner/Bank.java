package com.learning.NestedClasses.AnynomousInner;

public class Bank {


  public static void main(String args[]) {

     int vakue = 20;
     BankFin bank = new BankFin() {
        public void display(){
         System.out.println("Bank");
       }


     };
      bank.display();
  }



  static class BankFin {
   void display(){}

  }

}
