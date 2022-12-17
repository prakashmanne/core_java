package com.careerit.cj.basics.operators;

import java.util.Scanner;

public class GenerateEvenNumbersInRange {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the lb:");
    int lb = sc.nextInt();
    System.out.println("Enter the ub:");
    int ub = sc.nextInt();
    for (int i = lb; i <= ub; i++) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
