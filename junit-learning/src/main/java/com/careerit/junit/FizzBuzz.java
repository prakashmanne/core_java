package com.careerit.junit;

public class FizzBuzz {

  public String getWord(int num) {
    if (num % 3 == 0 && num % 5 == 0) {
      return "FizzBuzz";
    } else if (num % 3 == 0) {
      return "Fizz";
    } else if (num % 5 == 0) {
      return "Buzz";
    }
    return Integer.toString(num);
  }
}
