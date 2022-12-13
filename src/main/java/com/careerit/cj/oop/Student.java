package com.careerit.cj.oop;

public class Student {

  int id;
  String name;
  int std;
  int score;

  public Student(int id, String name, int std,int score) {
    this.id = id;
    this.name = name;
    this.std = std;
    this.score = score;
  }

  public void showInfo() {
    System.out.println(id + "," + name + "," + std+","+score);
  }

  public void promote() {
    std += 1;
  }
}
