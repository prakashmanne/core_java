package com.careerit.cj.basics.whileloop;

import java.util.Scanner;

public class GenerateNPrimes {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the N value :");
    int N = sc.nextInt();
    int count = 0;
    int i = 2;
    while (true) {
      if (isPrime(i)) {
        System.out.print(i + " ");
        count++;
      }
      if (count == N) {
        break;
      }
      i++;
    }
  }

  private static int primeCount(int lb, int ub) {
    int count = 0;
    for (int i = lb; i <= ub; i++) {
      if (isPrime(i)) {
        count++;
      }
    }
    return count;
  }

  private static boolean isPrime(int num) {
    if ((num < 2) || (num % 2 == 0 && num != 2)) {
      return false;
    }
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
