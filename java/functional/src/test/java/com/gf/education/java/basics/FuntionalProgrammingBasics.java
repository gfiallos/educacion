package com.gf.education.java.basics;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class FuntionalProgrammingBasics {
  private final List<Integer> data;
  private static final List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

  public FuntionalProgrammingBasics() {
    data = List.of(3, 4, 6, 3, 7, 4);
  }

  @Test
  public void printAllNumbersInListTraditional() {
    Assertions.assertTrue(FuntionalProgramming1.printAllNumbersInListTraditional(data));
  }

  @Test
  public void printAllNumbersInListFunctional() {
    Assertions.assertTrue(FuntionalProgramming1.printAllNumbersInListFunctional(data));
  }

  @Test
  public void printEvenNumbersInListTraditional() {
    Assertions.assertTrue(FuntionalProgramming2.printEvenStructured(data));
  }

  @Test
  public void printEvenNumbersInListFunctional() {
    Assertions.assertTrue(FuntionalProgramming2.printEvenFuntional(data));
  }

  @Test
  public void exercisesFilter() {
    Assertions.assertTrue(FuntionalProgramming2.exercise1(data));
    Assertions.assertTrue(FuntionalProgramming2.exercise2(FuntionalProgrammingBasics.courses));
    Assertions.assertTrue(FuntionalProgramming2.exercise3(FuntionalProgrammingBasics.courses));
    Assertions.assertTrue(FuntionalProgramming2.exercise4(FuntionalProgrammingBasics.courses));
  }

  @Test
  public void exercisesMap() {
    new FuntionalProgramming3().example1(data)
                               .exercise1(data)
                               .exercise2(FuntionalProgrammingBasics.courses);
  }
}