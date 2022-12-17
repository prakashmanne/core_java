package com.careerit.cj.arraysandlist;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class RandomQuizQuestions {
  public static void main(String[] args) {

    List<Integer> list = IntStream.rangeClosed(1001,1500).boxed().toList();
    // Get 50 unique random questions
    System.out.println(getUniqueRandomQuestions(50,list));
  }
  private static List<Integer> getUniqueRandomQuestions(int n,List<Integer> list){
    List<Integer> qlist = new ArrayList<>();
    while(qlist.size()!=n){
        int num = ThreadLocalRandom.current().nextInt(0,500);
        int qnum = list.get(num);
        if(!qlist.contains(qnum)){
            qlist.add(qnum);
        }
    }
    return qlist;
  }
  private static List<Integer> getEvenNumber(List<Integer> list){
      List<Integer> evenList = new ArrayList<>();
      for(Integer ele:list){
         if(ele % 2 == 0){
            evenList.add(ele);
         }
      }
      return evenList;
  }
}
