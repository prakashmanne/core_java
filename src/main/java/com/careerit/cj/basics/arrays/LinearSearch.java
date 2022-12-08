package com.careerit.cj.basics.arrays;
import java.util.Arrays;
public class LinearSearch {
  public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,7,8,9,10};
        int key = 9;
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                index = i;
                break;
            }
        }
        if(index !=-1){
          System.out.println("Element "+key+" is found at location :"+index);
        }else{
          System.out.println(key+" is not found");
        }
        index = Arrays.binarySearch(arr,key);
        System.out.println(index);
  }

}
