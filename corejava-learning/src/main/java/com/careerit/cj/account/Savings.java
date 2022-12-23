package com.careerit.cj.account;

public class Savings extends Account {
  private double minBalance;

  public Savings(String accNumber, String name, double balance, double minBalance) {
    super(accNumber, name, balance);
    this.minBalance = minBalance;
  }

  @Override
  public void withDraw(double amount) {
        if(amount <= (balance - minBalance)){
            balance -= amount;
           System.out.println("Account " + MaskDataUtil.maskAccountNumber(accNumber) + " is withdrawn amount " + amount + " and balance " + balance);
        }else{
          System.out.println("Sorry! you don't have sufficient funds");
        }
  }
}
