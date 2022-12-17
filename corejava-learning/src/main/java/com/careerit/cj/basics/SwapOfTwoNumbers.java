package com.careerit.cj.basics;

public class SwapOfTwoNumbers {

  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    System.out.println("Before swap a = " + a + " and b = " + b);
    int temp = a;
    a = b;
    b = temp;
    System.out.println("After swap a = " + a + " and b = " + b);
  }
}
