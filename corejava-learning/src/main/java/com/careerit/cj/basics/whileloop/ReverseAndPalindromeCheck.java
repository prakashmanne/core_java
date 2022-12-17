package com.careerit.cj.basics.whileloop;

import java.util.Scanner;

public class ReverseAndPalindromeCheck {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number :");
    int num = sc.nextInt();
    int temp = num;
    int rev = 0;
    while (temp != 0) {
        int r = temp % 10;
        rev = rev * 10 + r;
        temp = temp / 10;
    }
    System.out.println("Reverse of "+num+" is "+rev);
    if(rev == num){
      System.out.println("Given number "+num+" is palindrome");
    }else{
      System.out.println("Given number "+num+" is not palindrome");
    }
  }
}
