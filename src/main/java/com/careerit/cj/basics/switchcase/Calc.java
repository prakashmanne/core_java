package com.careerit.cj.basics.switchcase;

public class Calc {

  public static void main(String[] args) {
    int a = 20;
    int b = 10;
    showResult(a, b, "+");
    showResult(a, b, "-");
    showResult(a, b, "*");
    showResult(a, b, "/");
    showResult(a, b, "%");
  }


  public static void showResult(int num1, int num2, String ope) {
    int res = switch (ope) {
      case "+" ->   num1 + num2;
      case "-" -> num1 - num2;
      case "*" -> num1 * num2;
      case "/" -> num1 / num2;
      case "%" -> num1 % num2;
      default -> throw new IllegalArgumentException("Invalid operator! we don't have support");
    };
    System.out.println(num1 + " " + ope + " " + num2 + " = " + res);

  }

}
