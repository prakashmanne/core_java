package com.careerit.cj.oop;

public class Employee {

    long empno;
    String name;
    double salary;

    public Employee(int empno,String name,double salary){
        this.empno=empno;
        this.name = name;
        this.salary = salary;
    }
    public void showInfo(){
      System.out.println("Empno  :"+empno);
      System.out.println("Name   :"+name);
      System.out.println("Salary :"+salary);
    }
}
