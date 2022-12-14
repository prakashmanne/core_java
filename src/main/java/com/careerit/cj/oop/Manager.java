package com.careerit.cj.oop;

import java.util.Scanner;

public class Manager {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius :");
    double r = sc.nextDouble();
    Circle circle1 = new Circle(r);
    double area = circle1.area();
    System.out.println("Area of circle is " + area);

    System.out.println("Enter the radius :");
    r = sc.nextDouble();
    Circle circle2 = new Circle(r);
    area = circle2.area();
    System.out.println("Area of circle is " + area);
  }
}
