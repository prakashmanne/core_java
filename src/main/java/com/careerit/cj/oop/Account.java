package com.careerit.cj.oop;

public class Account {
  int accNumber;
  String name;
  double balance;

  public Account(int accNumber, String name, double balance) {
    this.accNumber = accNumber;
    this.name = name;
    this.balance = balance;
  }

  public void withdraw(double amount) {
    if (amount > balance) {
      System.out.println("Sorry! you don't sufficient balance to withdraw");
    }
    balance -= amount;
    System.out.println("Your current balance :" + balance);
  }

  public void deposit(double amount) {
    balance += amount;
    System.out.println("Your current balance :" + balance);
  }

  public void showBalance() {
    System.out.println("Your current balance :" + balance);
  }

  public void showInfo() {
    System.out.println("Account number: " + accNumber);
    System.out.println("Name          : " + name);
    System.out.println("Balance       : " + balance);
  }
}
