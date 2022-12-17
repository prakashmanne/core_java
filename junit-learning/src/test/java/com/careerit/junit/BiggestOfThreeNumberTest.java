package com.careerit.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BiggestOfThreeNumberTest {

  BiggestOfThreeNumber obj;

  @BeforeEach
  public void init() {
    obj = new BiggestOfThreeNumber();
  }

  @Test
  void biggestAsFirstElement() {
    int expected = 30;
    int actual = obj.biggest(30, 20, 10);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void biggestAsSecondElement() {
    int expected = 30;
    int actual = obj.biggest(10, 30, 20);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void biggestAsThirdElement() {
    int expected = 30;
    int actual = obj.biggest(10, 20, 30);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void biggestAsAllEqualValues() {
    int expected = 30;
    int actual = obj.biggest(30, 30, 30);
    Assertions.assertEquals(expected, actual);
  }
}
