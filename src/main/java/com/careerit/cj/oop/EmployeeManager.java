package com.careerit.cj.oop;

public class EmployeeManager {

  public static void main(String[] args) {
    Employee emp1 = new Employee(1001, "Krish", 98000);
    emp1.showInfo();
    Employee emp2 = new Employee(1002, "Sai", 120000);
    emp2.showInfo();
  }
}
