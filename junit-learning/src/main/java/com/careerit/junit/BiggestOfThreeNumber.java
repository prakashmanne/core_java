package com.careerit.junit;

public class BiggestOfThreeNumber {

  public int biggest(int a, int b, int c) {
    return (a > b && a > c) ? a : (b > c) ? b : c;
  }
}
