package com.careerit.cj.arraysandlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberOperations {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1001);
    list.add(1002);
    list.add(1003);
    list.add(1004);

    for(int i=0;i<list.size();i++){
      System.out.println(list.get(i));
    }
    for(Integer ele:list){
      System.out.println(ele);
    }
    System.out.println(list);
    list.remove(Integer.valueOf(1001));
    System.out.println(list);

    List<Integer> evenList = new ArrayList<>();
    evenList.add(10);
    evenList.add(20);
    evenList.add(30);

    List<Integer> oddList = new ArrayList<>();
    evenList.add(5);
    evenList.add(15);
    evenList.add(25);

    List<Integer> numList = new ArrayList<>();
    numList.addAll(evenList);
    numList.addAll(oddList);
    System.out.println(numList);
    Collections.sort(numList);
    System.out.println(numList);
    System.out.println(numList.contains(10));

  }

}
