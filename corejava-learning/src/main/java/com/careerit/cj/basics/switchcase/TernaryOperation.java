package com.careerit.cj.basics.switchcase;

public class TernaryOperation {

  public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 45;
        int big = (num1 > num2 && num1 > num3) ? num2 : (num2 > num3 ) ? num2: num3;
  }
}
