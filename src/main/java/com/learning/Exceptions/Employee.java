package com.learning.Exceptions;

public class Employee {

  private String eName;
  private int eSal;
  private String eAddress;
  private int eNo;

  public Employee(String eName, int eSal, String eAddress, int eNo) {
    this.eName = eName;
    this.eSal = eSal;
    this.eAddress = eAddress;
    this.eNo = eNo;
  }

  public String geteName() {
    return eName;
  }

  public int geteSal() {
    return eSal;
  }

  public String geteAddress() {
    return eAddress;
  }

  public int geteNo() {
    return eNo;
  }

}
