package com.careerit.cj.basics;

import java.util.Scanner;

public class CalculateInvoiceAmount {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the bill amount :");
    float billAmount = sc.nextFloat();
    float discount = 0;

    if(billAmount >= 5000){
        discount = billAmount * 0.2f;
    }
    float netAmount = billAmount - discount;
    System.out.println("Bill Amount  :"+billAmount);
    System.out.println("Discount     :"+discount);
    System.out.println("Net Amount   :"+netAmount);


  }
}
