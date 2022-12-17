package com.careerit.junit;

public class NumberOperations {

  public boolean isPrime(int num) {
    if (num < 2 || (num % 2 == 0 && num != 2)) {
      return false;
    }
    for (int i = 2; i <= (int) Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public int[] getEvenNumbers(int[] arr) {
    int[] temp = new int[arr.length];
    int c = 0;
    for (int ele : arr) {
      if (ele % 2 == 0) {
        temp[c++] = ele;
      }
    }
    int[] res = new int[c];
    System.arraycopy(temp, 0, res, 0, c);
    return res;
  }

  public boolean search(int[] arr, int key) {
    if (arr == null || arr.length == 0) {
      return false;
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return true;
      }
    }
    return false;
  }

}
