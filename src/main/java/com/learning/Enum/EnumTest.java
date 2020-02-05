package com.learning.Enum;

public class EnumTest {

  public static void main(String args[]) {
    /*System.out.println(WeekDays.Friday);
    System.out.println(WeekDays.valueOf("Friday"));

    for(WeekDays w : WeekDays.values()) {
      System.out.println(w.toString());
    }*/

    getSwitch(WeekDays.Wednesday);

  }

  static void getSwitch(WeekDays day){

    switch (day) {
      case Monday: System.out.println(day.toString());
      break;
      case Tuesday: System.out.println(day.toString());
        break;
      case Thursday: System.out.println(day.toString());
        break;
      case Wednesday: System.out.println(day.toString());
        break;
    }

  }

}

