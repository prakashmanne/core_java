package com.careerit.cj.basics.arrays;

import java.util.Arrays;

public class BubbleSortExample {
  public static void main(String[] args) {
    int[] arr = new int[]{1, 9, 0, 3, 2, 5, 8, 6, 7};
    System.out.println("Before sort :" + Arrays.toString(arr));
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    System.out.println("After sort :" + Arrays.toString(arr));
  }
}
