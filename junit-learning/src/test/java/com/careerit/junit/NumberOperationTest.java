package com.careerit.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

}
