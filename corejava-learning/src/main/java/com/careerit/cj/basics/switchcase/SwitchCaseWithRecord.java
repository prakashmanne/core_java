package com.careerit.cj.basics.switchcase;

interface Shape{
    void draw();
}
record Square() implements Shape{
    public void draw(){
      System.out.println("Square");
    }
}
record Circle() implements Shape{
  public void draw(){
    System.out.println("Circle");
  }
}
public class SwitchCaseWithRecord {

  public static void main(String[] args) {

  }
}
