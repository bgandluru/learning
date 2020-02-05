package com.learning.Aggregation;

public class MainAggregation {

  public static void main(String args[]){

    CreditCheckDepartment ccd = new CreditCheckDepartment();
    LegalDepartment ld = new LegalDepartment();
    SSNDepartment ssnd = new SSNDepartment();

    Bofa bofa = new Bofa(ccd,ld,ssnd);
    bofa.createCustomer();

    WellsFargo wells = new WellsFargo(ccd,ld,ssnd);
    wells.createCustomer();

  }


}
