package com.learning.NestedClasses.InnerClasses;

import javafx.scene.effect.Shadow;


public class BankClient {

  public static void main(String args[]) {

   /* Bank bank = new Bank();
    //Bank.Bofa bofa = bank.new Bofa();
    bank.dispaly();
*/
   /* StaticBank.Bofa wells = new StaticBank.Bofa();
    wells.display();*/

    ShadowBank.ShadowBofa bofa = new ShadowBank().new ShadowBofa();
    bofa.dispaly(20);

  }
}
