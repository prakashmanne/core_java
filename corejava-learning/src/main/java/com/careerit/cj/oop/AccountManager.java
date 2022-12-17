package com.careerit.cj.oop;

public class AccountManager {
  public static void main(String[] args) {
        Account acc1 = new Account(1001,"Krish",45000);
        Account acc2 = new Account(1002,"Manoj",95000);
        acc1.showInfo();
        acc2.showInfo();
        acc1.deposit(5000);
  }
}
