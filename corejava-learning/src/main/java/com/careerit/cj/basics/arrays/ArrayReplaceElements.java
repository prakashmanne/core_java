package com.careerit.cj.basics.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayReplaceElements {
  public static void main(String[] args) {

    int[] arr = new int[]{2, 4, 6, 8, 10, 1, 3, 5, 7, 9};
    int key1 = 10, key2 = 5, key3 = 11;
    System.out.println(isFound(arr,key1,key2,key3));
    System.out.println(isSubSet(arr,new int[]{3,4,11}));
  }

  private static boolean isFound(int[] arr, int k1, int k2, int k3) {
    int[] temp = new int[arr.length];
    System.arraycopy(arr, 0, temp, 0, arr.length);
    Arrays.sort(temp);
    if (Arrays.binarySearch(temp, k1) >= 0 && Arrays.binarySearch(temp, k2) >= 0 && Arrays.binarySearch(temp, k3) >= 0) {
      return true;
    }
    return false;
  }

  private static boolean isSubSet(int[] master, int[] child) {
      boolean flag = true;
      for(int i=0;i<child.length;i++){
          if(indexOf(master,child[i])==-1){
            flag=false;
            break;
          }
      }
      return flag;
  }
  private static int indexOf(int[] arr,int ele){
      for(int i=0;i<arr.length;i++){
        if(arr[i] == ele){
          return i;
        }
      }
      return -1;
  }
}
