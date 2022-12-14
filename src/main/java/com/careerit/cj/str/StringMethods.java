package com.careerit.cj.str;

public class StringMethods {

  public static void main(String[] args) {

    String name = "Krish";
    System.out.println(name.length());
    System.out.println(name.charAt(0));
    System.out.println(name.toUpperCase());
    // Convert name to upper case print character by character
    name = name.toUpperCase();
    for (int i = 0; i < name.length(); i++) {
      System.out.println(name.charAt(i));
    }
    for (int i = name.length() - 1; i >= 0; i--) {
      System.out.println(name.charAt(i));
    }
    System.out.println(isPalindrome("MOM"));
    System.out.println(isPalindrome("DUMMY"));
  }

  private static boolean isPalindrome(String str) {
    for (int i = 0, j = str.length() - 1; i <= j; i++, j--) {
      if (str.charAt(i) != str.charAt(j)) {
        return false;
      }
    }
    return true;
  }

}
