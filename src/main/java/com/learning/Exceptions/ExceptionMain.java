package com.learning.Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import jdk.nashorn.internal.runtime.ECMAException;


public class ExceptionMain {

  public static void main(String args[]) throws Exception {

try {
  printValues();
  System.out.println(" Exception in main 1");
} catch (Exception e) {
  e.printStackTrace();
}
     System.out.println(" Exception in main 3");
}



  static void printValues () throws Exception {
   //try {
    printValues1();
   //} catch (Exception e) {
   //  e.printStackTrace();
   //}

  }

  static void printValues1 () throws Exception {
    // try {
    int k = 1 / 0;
   /*} catch (Exception e) {
    e.printStackTrace();
   }*/
  }






}
