package com.careerit.cj.arraysandlist;

public class CastingAndBoxing {
  public static void main(String[] args) {

    int a = 10;
    float b = a;
    System.out.println(a);
    System.out.println(b);

    float c = 10.25f;
    int d = (int) c;
    System.out.println(c);
    System.out.println(d);

    int num = 100;
    Integer obj = num;
    Integer ele =Integer.valueOf(100);
    int eleVal = ele;

  }
}
