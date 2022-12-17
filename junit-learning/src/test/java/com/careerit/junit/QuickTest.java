package com.careerit.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.stream.Collectors;

public class QuickTest {

  @Test
  void biggestNumber() {
    List<Integer> list = new ArrayList<>();
    list.add(101);
    list.add(109);
    list.add(110);
    list.add(108);
//    Collections.sort(list);
    System.out.println(list);
    List<Integer> sorted = list.stream().sorted().toList();
    System.out.println(sorted);
    int ele = sorted.get(list.size() - 1);
    Assertions.assertEquals(110, ele);
  }

  @Test
  void getEvenNumbers() {
    NumberOperations obj = new NumberOperations();
    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] expected = new int[]{2, 4, 6, 8, 10};
    int[] actual = obj.getEvenNumbers(arr);
    System.out.println(Arrays.toString(actual));
    Assertions.assertArrayEquals(expected, actual);

  }
  @Test
  void searchElement() {
    NumberOperations obj = new NumberOperations();
    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    assertAll("search",
        ()->assertEquals(true,obj.search(arr,5)),
        ()->assertEquals(false,obj.search(arr,11)),
        ()->assertEquals(true,obj.search(arr,1))
        );
  }
  @Test
  void searchElementWithoutKey() {
    NumberOperations obj = new NumberOperations();
    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    boolean actual = obj.search(arr,11);
    Assertions.assertEquals(false, actual);
  }
}
