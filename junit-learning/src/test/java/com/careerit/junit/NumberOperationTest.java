package com.careerit.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOperationTest {

  NumberOperations obj;
  @BeforeEach
  public void init(){
      obj = new NumberOperations();
  }
  @Test
  void isPrimeWithPrime() {
    boolean actual = obj.isPrime(19);
    Assertions.assertEquals(true, actual);
  }
  @Test
  void isPrimeWithNNumber() {
    boolean actual = obj.isPrime(-10);
    Assertions.assertEquals(false, actual);
  }
  @Test
  void isPrimeWithNotPrime() {
    boolean actual = obj.isPrime(10);
    Assertions.assertEquals(false, actual);
  }

  @Test
  void isPrimeWithNotPrimeWithOdd() {
    boolean actual = obj.isPrime(15);
    Assertions.assertEquals(false, actual);
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
  @Test
  void searchElementWithoutEmptyArray() {
    NumberOperations obj = new NumberOperations();
    int[] arr = new int[]{};
    boolean actual = obj.search(arr,11);
    Assertions.assertEquals(false, actual);
  }
  @Test
  void divideWithValidNumbers(){
      NumberOperations obj = new NumberOperations();
      int actual=obj.divide(5,2);
      int expected = 2;
      Assertions.assertEquals(expected,actual);
  }

  @Test
  void divideWithZero(){
    NumberOperations obj = new NumberOperations();
    Assertions.assertThrows(ArithmeticException.class,()->obj.divide(5,0));
  }

}
