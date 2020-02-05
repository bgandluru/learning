package com.learning.Association;

public interface Bank {

     boolean storeBeneficiary(String beneficiaryName,int accountNumber);
     boolean sendAmount(Double amount,int accountNumber);
     String getNotificaton();

  }
