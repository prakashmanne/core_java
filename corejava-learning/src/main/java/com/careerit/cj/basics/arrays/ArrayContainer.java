package com.careerit.cj.basics.arrays;

import java.util.Arrays;
public class ArrayContainer {

  public static void main(String[] args) {
    int[] arr1 = new int[]{1, 2, 3, 4};
    int[] arr2 = new int[]{5, 6, 7, 8};
    int[] arr3 = new int[arr1.length + arr2.length];

//        int count = 0;
//        for(int i=0;i<arr1.length;i++){
//            arr3[count++] = arr1[i];
//        }
//        for(int i=0;i<arr2.length;i++){
//            arr3[count++] = arr2[i];
//        }
    System.arraycopy(arr1, 0, arr3, 0, arr1.length);
    System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
    System.out.println(Arrays.toString(arr3));
    int[] arr4 = new int[]{9,10,11,12,13,14,15};
    int[] temp = new int[arr3.length+arr4.length];
    System.arraycopy(arr3,0,temp,0,arr3.length);
    System.arraycopy(arr4,0,temp,arr3.length,arr4.length);
    arr3 = temp;
    System.out.println(Arrays.toString(arr3));

  }
}
