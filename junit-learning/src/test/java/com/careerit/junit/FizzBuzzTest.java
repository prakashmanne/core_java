package com.careerit.junit;

import org.junit.jupiter.api.*;

@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
public class FizzBuzzTest {

  @BeforeAll
  static void setup() {
    System.out.println("@BeforeAll - executes once before all test methods in this class");
  }

  @BeforeEach
  void init() {
    System.out.println("@BeforeEach - executes before each test method in this class");
  }
  @Test
  void getWordWithFizz() {
    FizzBuzz obj = new FizzBuzz();
    String actual = obj.getWord(3);
    Assertions.assertEquals("Fizz", actual,"if number % 3 == 0 then it should return fizz");
  }
  @Test
  void getWordWithBuzz() {
    FizzBuzz obj = new FizzBuzz();
    String actual = obj.getWord(5);
    Assertions.assertEquals("Buzz", actual);
  }
  @Test
  void getWordWithFizzBuzz() {
    FizzBuzz obj = new FizzBuzz();
    String actual = obj.getWord(15);
    Assertions.assertEquals("FizzBuzz", actual);
  }
  @Test
  void getWordWithNumber() {
    FizzBuzz obj = new FizzBuzz();
    String actual = obj.getWord(8);
    Assertions.assertEquals("8", actual);
  }

}
