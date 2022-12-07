package com.careerit.cj.basics.arrays;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class SumAndAverage {

  public static void main(String[] args) {

    int[] arr = getRandomNumbers();
    System.out.println(Arrays.toString(arr));
    System.out.println(getSum(arr));
    System.out.println(getAverage(arr));
    System.out.println(getSmallest(arr));
    System.out.println(getBiggest(arr));
    System.out.println(search(arr,35));
  }

  private static int getSum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  private static double getAverage(int[] arr) {
    return getSum(arr) / (double) arr.length;
  }

  private static int getBiggest(int[] arr) {
    int big = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if(big < arr[i]){
            big = arr[i];
        }
    }
    return big;
  }

  private static int getSmallest(int[] arr) {
      int small = arr[0];
      for(int i=1;i<arr.length;i++){
          if(small > arr[i]){
            small = arr[i];
          }
      }
      return small;
  }

  private static boolean search(int[] arr, int key) {
      for(int i=0;i<arr.length;i++){
          if(key == arr[i]){
            return true;
          }
      }
      return false;
  }

  private static int[] getRandomNumbers() {
    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = ThreadLocalRandom.current().nextInt(10, 100);
    }
    return arr;
  }
}
