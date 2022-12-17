package com.careerit.cj.str;

public class Quiz {
  public static void main(String[] args) {
    String data = "Hi welcome to Bangalore";
    System.out.println(data.substring(2,10).trim().length()); // welcome =>welcome
    System.out.println(data.substring(2,10).trim().substring(3)); // welcome=>welcome=>come
  }
}
