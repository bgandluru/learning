package com.learning.Association;

public class Wellsfargo implements Bank{

  //Customer customer = new Customer();

  private double amount;
  boolean transferStatus;

  public boolean storeBeneficiary(String beneficiaryName,int accountNumber){

    System.out.format("Beneficiary added with Wellsfargo '%s' and %d \n",beneficiaryName,accountNumber);

    return true;
  }

  public boolean sendAmount(Double amount,int accountNumber){
      this.amount= amount;

    System.out.format("Amount transfered with WellsFargo %d and amount %f \n",accountNumber,amount);
   // sendNotificaton();
     transferStatus = true;
    return true;

  }

  public String getNotificaton(){
    String status;
    if(transferStatus){
    status = "Successfull"; } else { status = "Failed"; }

    return status;

  }


}
