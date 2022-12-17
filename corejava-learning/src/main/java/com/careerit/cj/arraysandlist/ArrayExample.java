package com.careerit.cj.arraysandlist;


import java.util.Arrays;

class ArrayContainer {
  int[] arr;
  int c = 0;

  ArrayContainer() {
    arr = new int[3];
  }

  public void add(int ele) {
    if (c > arr.length - 1) {
      int[] temp = new int[arr.length + (arr.length / 2)];
      System.arraycopy(arr, 0, temp, 0, arr.length);
      arr = temp;
    }
    arr[c++] = ele;

  }

  public void remove(int ele) {
        int index = indexOf(ele);
        if(index!= -1){
          int[] temp = new int[arr.length-1];
          if(index == 0){
             System.arraycopy(arr,1,temp,0,arr.length-1);
          }else if(index == arr.length-1){
            System.arraycopy(arr,0,temp,0,arr.length-1);
          }else{
            System.arraycopy(arr,0,temp,0,index);
            System.arraycopy(arr,index+1,temp,index,arr.length-index-1);
          }
          arr = temp;
          c--;
        }
  }

  public void showElements() {
    if (c == 0) {
      System.out.println("[]");
    } else {
      StringBuilder sb = new StringBuilder("[");
      for (int i = 0; i < c; i++) {
        sb.append(arr[i]);
        if (i != c - 1) {
          sb.append(",");
        }
      }
      sb.append("]");
      System.out.println(sb.toString());
      Arrays.toString(arr);
    }
  }

  private int indexOf(int ele) {
    int index = -1;
    for (int i = 0; i < c; i++) {
      if (arr[i] == ele) {
        index = i;
        break;
      }
    }
    return index;
  }
}

public class ArrayExample {
  public static void main(String[] args) {
    ArrayContainer obj = new ArrayContainer();
    obj.add(100);
    obj.add(200);
    obj.add(300);
    obj.add(400);
    obj.add(500);
    obj.add(600);
    obj.add(700);
    obj.add(800);
    obj.add(900);
    obj.add(1000);
    obj.showElements();
    obj.remove(600);
    obj.showElements();
    obj.remove(100);
    obj.showElements();
    obj.remove(1000);
    obj.showElements();
  }
}
