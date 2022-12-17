package com.careerit.cj.basics;

import com.careerit.cj.basics.game.PrimeNumberOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeNumberOperationsTest {
    @Test
    void testWithPrime(){
      PrimeNumberOperations obj = new PrimeNumberOperations();
      boolean actual = obj.isPrime(17);
      Assertions.assertEquals(true,actual);
    }
    @Test
    void testWithNotPrime(){
      PrimeNumberOperations obj = new PrimeNumberOperations();
      boolean actual = obj.isPrime(27);
      Assertions.assertEquals(false,actual);
    }
    @Test
    void testWithPrimeWithNveNumber(){
      PrimeNumberOperations obj = new PrimeNumberOperations();
      boolean actual = obj.isPrime(-17);
      Assertions.assertEquals(false,actual);
    }
}
