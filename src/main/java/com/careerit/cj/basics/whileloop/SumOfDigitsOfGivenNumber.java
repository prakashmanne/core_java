package com.careerit.cj.basics.whileloop;

import java.util.Scanner;

public class SumOfDigitsOfGivenNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number :");
    int num = sc.nextInt();
    int temp = num;
    int sum = 0;
    while (temp != 0) {
      sum += temp % 10;
      temp /= 10;
    }
    System.out.println("The digits sum of  :" + num + " is " + sum);
  }
}
