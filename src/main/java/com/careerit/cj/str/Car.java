package com.careerit.cj.str;

public class Car {
        String regno;
        String model;
        int yearOfMake;
        public Car(String regno,String model,int yearOfMake){
          this.regno = regno;
          this.model = model;
          this.yearOfMake = yearOfMake;
        }
        public Car(){}

  public static void main(String[] args) {
        Car car = new Car("KA01EP9990","Shine",2010);
  }

}
