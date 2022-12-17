package com.careerit.cj.basics.arrays;

import java.util.concurrent.ThreadLocalRandom;

class  Employee{
    private String name;
    private float salary;

  public Employee(String name, float salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getSalary() {
    return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }
}
public class EmployeeSalary {
  public static void main(String[] args) {
      Employee[] arr = new Employee[100];
      for(int i=0;i<arr.length;i++){
          arr[i] = new Employee("Employee_"+i, ThreadLocalRandom.current().nextInt(2000,5000));
      }

      for(Employee emp:arr){
        System.out.println(emp.getName()+" "+emp.getSalary());
      }
  }
}
