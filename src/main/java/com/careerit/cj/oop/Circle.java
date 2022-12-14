package com.careerit.cj.oop;

public class Circle {
  double r;
  public Circle(double r) {
    this.r = r;
  }
  public double area(){
      return Math.PI * r * r;
  }
}
