package com.learning.NestedClasses.MethodLocal;

public class Bank {

  private static int value = 10;
   static  void display(){
       int valueinner = 30;
        class Bofa{
          void display() {
            System.out.println("Bank of America"+valueinner);
          }
        }

        new Bofa().display();

    }


    public static  void main(String args[]){

      Bank.display();

    }

}
