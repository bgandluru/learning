package com.learning.NestedClasses.InnerClasses;

public class ShadowBank {

  int value = 1;

   class ShadowBofa{
     int value = 2;

     void dispaly(int value) {
        System.out.println("value : "+value);
        System.out.println("this.value : "+this.value);
       System.out.println("Shadow.this.value : "+ShadowBank.this.value);
     }
  }
}
