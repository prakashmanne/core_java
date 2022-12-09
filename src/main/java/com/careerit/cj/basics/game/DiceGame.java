package com.careerit.cj.basics.game;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int systemNum = ThreadLocalRandom.current().nextInt(1, 7);

    for (int i = 1; i <= 3; i++) {
      System.out.println("Guess a number (1-6):");
      int userNum = sc.nextInt();
      if (systemNum == userNum) {
        System.out.println("Good! you guessed number in " + i + " attempts");
        } else {
        System.out.println("Sorry! your guess is wrong");
        if(i==3){
          System.out.println("You reached max number of attempts, try again");
        }
      }
    }



  }

}
