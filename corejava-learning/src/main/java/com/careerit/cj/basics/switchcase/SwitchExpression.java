package com.careerit.cj.basics.switchcase;

public class SwitchExpression {

  public static int noOfDays(int month, int year) {
    int days =
        switch (month) {
          case 1, 3, 5, 7, 8, 10, 12 -> 31;
          case 4, 6, 9, 11 -> 30;
          case 2 -> {
            int d;
            if (isLeapYear(year)) {
              d = 29;
            } else {
              d = 28;
            }
            yield d;
          }
          default -> {
            throw new IllegalArgumentException("Invalid month");
          }
        };
    return days;
  }

  public static boolean isLeapYear(int year) {
    if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
      return true;
    } else {
      return false;
    }
  }
}
