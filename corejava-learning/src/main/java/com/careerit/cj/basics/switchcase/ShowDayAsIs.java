package com.careerit.cj.basics.switchcase;

enum Day {
  SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
  THURSDAY, FRIDAY, SATURDAY
}
public class ShowDayAsIs {

  public static void main(String[] args) {
    System.out.println(Day.MONDAY +" => "+getMessage(Day.MONDAY));
  }

  public static String getMessage(Day day){
    String message = "";
    switch (day){
      case MONDAY:
      case TUESDAY:
      case WEDNESDAY:
           message = "Busy day";
           break;
      case THURSDAY:
      case FRIDAY: message = "Normal day";
      break;
      case SATURDAY:
      case SUNDAY:
          message = "Fun day!";
          break;
      default:
          message = "Invalid day";
    }
    return message;

  }
}


