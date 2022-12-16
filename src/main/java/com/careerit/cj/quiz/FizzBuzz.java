package com.careerit.cj.quiz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
  public static void main(String[] args) {
    System.out.println("1256 - 34 + 451 * 134".length());
    System.out.println(showNumbers("1256 - 34 + 451 * 134"));

//      for(int i = 5 ;i<=500;i++){
//        System.out.println(i+" => "+getWord(i));
//      }
  }

  // num % 3 == 0 return "Fizz"
  // num % 5 == 0 return "Buzz"
  // num %3 and num % 5 == 0 return "FizzBuzz"
  // if above conditions false then return number as string
  private static String getWord(int num) {
    if (num % 3 == 0 && num % 5 == 0) {
      return "FizzBuzz";
    } else if (num % 3 == 0) {
      return "Fizz";
    } else if (num % 5 == 0) {
      return "Buzz";
    } else {
      return Integer.toString(num);
    }
  }

  private static List<Integer> showNumbers(String exp){
    //Input : "1256 - 34 + 451 * 134" => 1256,34,451,134
    List<Integer> list = new ArrayList<>();
    char[] arr = exp.toCharArray();
    for(int i=0;i<arr.length;i++){
        char ch = arr[i];
        if(ch == ' '){
          continue;
        }
        if(ch == '+' || ch == '-' || ch=='*'||ch=='/'){
          continue;
        }
        StringBuilder sb = new StringBuilder();
        while( i < arr.length && arr[i]>='0' && arr[i] <= '9'){
            sb.append(arr[i]);
            i++;

        }
        list.add(Integer.parseInt(sb.toString()));
    }
    return list;
  }
}
