package com.learning.Domain;

import java.util.Objects;


public class Customer {

  private String name;
  private int id;
  private String address;
  private double amount;
  private boolean status;

  public Customer(String name, int id, String address, double amount, boolean status) {
    this.name = name;
    this.id = id;
    this.address = address;
    this.amount = amount;
    this.status = status;
  }

  public Customer(String name, int id, String address) {
    this.name = name;
    this.id = id;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public String getAddress() {
    return address;
  }

  public double getAmount() {
    return amount;
  }

  public boolean isStatus() {
    return status;

  }

  @Override
  public String toString() {
    return "Customer{" + "name='" + name + '\'' + ", id=" + id + ", address='" + address + '\'' + ", amount=" + amount
        + ", status=" + status + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Customer)) {
      return false;
    }
    Customer customer = (Customer) o;
    return id == customer.id && Double.compare(customer.amount, amount) == 0 && status == customer.status
        && Objects.equals(name, customer.name) && Objects.equals(address, customer.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, address, amount, status);
  }
}
