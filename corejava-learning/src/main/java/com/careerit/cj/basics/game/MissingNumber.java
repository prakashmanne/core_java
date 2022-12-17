package com.careerit.cj.basics.game;

import java.util.Arrays;

public class MissingNumber {


  public int missingNumber(int[] sender, int[] receiver) {
    long startTime = System.currentTimeMillis();
    Arrays.sort(sender);
    Arrays.sort(receiver);
    boolean flag = true;
    int num = 0;
    for (int i = 0; i < sender.length - 1; i++) {
      if (sender[i] != receiver[i]) {
        num = sender[i];
        flag = false;
        break;
      }
    }
    if (flag) {
      num = sender[sender.length - 1];
    }
    long endTime = System.currentTimeMillis();
    System.out.println("Total time " + (endTime - startTime));
    return num;

//    int sum1 = 0;
//    for (int num : sender) {
//      sum1 += num;
//    }
//    int sum2 = 0;
//    for (int num : receiver) {
//      sum2 += num;
//    }
//    return sum1 - sum2;
  }
}
