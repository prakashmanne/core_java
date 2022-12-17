package com.careerit.cj.str;

public class StringExample {
  public static void main(String[] args) {
    String str1 = "hello";
    String str2 = "hello";
    System.out.println(str1 == str2);

    String str3 = new String("hello");
    String str4 = new String("hello");
    System.out.println(str3 == str4);

    System.out.println(str3.equals(str4));
    System.out.println(str1.equals(str4));

    char[] arr = new char[]{'h','e','l','l','o'};
    String str5 = new String(arr);

    String str6 = "Core";
    String str7 = "Core Java";
    str6 = str6.concat(" Java");
    System.out.println(str6);
    System.out.println(str7);
    System.out.println(str6 == str7);
    System.out.println(str6.equals(str7));

    // == or equals
  }
}
