package com.learning.inheritance.multiple;

public interface GenericBank extends Bank,Globalbank {

  @Override
  default double withdrawFunds() {
    return 0;
  }

  @Override
  default double getBalance() {
    return 0;
  }

  @Override
  default boolean transferFunds() {
    return false;
  }

  @Override
  default void getDeposits() {

    Bank.super.getDeposits();
    Globalbank.super.getDeposits();
  }

  @Override
  default String getAccountInfo() {
    return null;
  }

  @Override
  default String getCustomerInfo() {
    return null;
  }

  @Override
  default boolean depositFunds() {
    return false;
  }
}
