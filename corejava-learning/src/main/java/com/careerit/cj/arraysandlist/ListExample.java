package com.careerit.cj.arraysandlist;


import java.util.ArrayList;
import java.util.List;

class ListContainer {
  List<Integer> list = new ArrayList<>();
  public void add(int ele) {
    list.add(ele);
  }
  public void remove(Integer ele) {
    list.remove(ele);
  }
  public void showElements() {
    System.out.println(list);
  }
}

public class ListExample {
  public static void main(String[] args) {
    ListContainer obj = new ListContainer();
    obj.add(100);
    obj.add(200);
    obj.add(300);
    obj.add(400);
    obj.add(500);
    obj.add(600);
    obj.add(700);
    obj.add(800);
    obj.add(900);
    obj.add(1000);
    obj.showElements();
    obj.remove(600);
    obj.showElements();
    obj.remove(100);
    obj.showElements();
    obj.remove(1000);
    obj.showElements();
  }
}
