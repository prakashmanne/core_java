package com.careerit.cj.basics.switchcase;

import java.util.Scanner;

public class BankExample {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    while(true) {
      System.out.println("-".repeat(100));
      System.out.println("1.Bike 2.Car 3.Ship 4. Exit");
      System.out.println("-".repeat(100));
      System.out.println("Enter your choice :");
      int ch = sc.nextInt();
      switch (ch){
        case 1:
          System.out.println("You are going play Bike game");
          break;
        case 2:
          System.out.println("You are going play Car game");
          break;
        case 3:
          System.out.println("You are going play Ship game");
          break;
        case 4:
          System.out.println("You are going quit, Thank you visit again");
          System.exit(0);
        default:
          System.out.println("Please enter valid option to play game ( 1-3 )");
          break;
      }
    }
  }

}
