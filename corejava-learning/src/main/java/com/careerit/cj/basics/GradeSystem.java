package com.careerit.cj.basics;

import java.util.Scanner;

public class GradeSystem {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the score :");
    int score = sc.nextInt();
    if(score >=0 && score <= 40){
      System.out.println("D");
    }else if(score > 40 && score <= 60){
      System.out.println("C");
    }else if(score > 60 && score <= 90){
      System.out.println("B");
    }else if(score > 90 && score <= 100){
      System.out.println("A");
    }else{
      System.out.println("Sorry! invalid score");
    }

  }
}
