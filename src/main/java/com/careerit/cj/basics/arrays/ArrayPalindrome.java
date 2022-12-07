package com.careerit.cj.basics.arrays;

import java.util.Arrays;

public class ArrayPalindrome {

  public static void main(String[] args) {
    System.out.println(isPalindrome(new int[]{1,2,3,2,1}));
    System.out.println(Arrays.toString(generatePrimeNumber(100)));
    showSubArrays(new int[]{1,2,3,4,5,6,7},5);
  }

  private static void showSubArrays(int[] arr,int k){
      for(int i=0;i<=arr.length-k;i++){
          for(int j=i;j<i+k;j++){
            System.out.print(arr[j]+" ");
          }
        System.out.println();
      }
  }

  private static int[] generatePrimeNumber(int n){
        int[] arr = new int[n];
        int count = 0;
        for(int i=2;;i++){
            if(isPrime(i)){
                arr[count++] = i;
            }
            if(count == n){
              break;
            }
        }
        return arr;
  }
  private static boolean isPrime(int num){
      if(num<2 || (num %2 == 0 && num!=2)){
        return false;
      }
      for(int i=2;i<=num/2;i++){
          if(num % 2 == 0){
            return false;
          }
      }
      return true;
  }
  private static boolean isPalindrome(int[] arr) {
    for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
          if(arr[i]!=arr[j]){
            return false;
          }
    }
    return true;
  }
}
