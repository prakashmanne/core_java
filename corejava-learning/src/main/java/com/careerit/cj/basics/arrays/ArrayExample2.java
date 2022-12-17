package com.careerit.cj.basics.arrays;

public class ArrayExample2 {


  public static void main(String[] args) {
    int[] arr = new int[]{10, 30, 20, 50, 40};

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println("");
    for(int i= arr.length-1;i>=0;i--){
      System.out.print(arr[i]+" ");
    }


  }

}
