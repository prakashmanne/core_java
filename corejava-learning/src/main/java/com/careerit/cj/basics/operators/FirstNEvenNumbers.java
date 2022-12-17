package com.careerit.cj.basics.operators;

import java.util.Scanner;

public class FirstNEvenNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the N value :");
    int N = sc.nextInt();
    // 20 => 2 4 6 8 10 12 14 16 18 20
    for (int i = 1; i <= N; i = i + 2) {
      System.out.print(i + " ");
    }
  }
}
