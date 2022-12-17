package com.careerit.cj.basics.operators;

public class BreakAndContinue {

  public static void main(String[] args) {

    for (int i = 1; i <= 30; i++) {
      if (i % 3 == 0 && i % 9 == 0) {
        continue;
      }
      System.out.print(i+" ");
    }
  }
}
