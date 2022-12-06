package com.careerit.cj.basics.arrays;
import java.util.*;

public class ArrayExample1 {
  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    System.out.println(Arrays.toString(arr));
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
