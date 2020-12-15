package com.gf.education.java.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

public class StreamExamplesTest {
  private final List<Integer> numbers = List.of(2, 3, 6, 4, 3, 2, 3, 4, 5, 6, 7, 8, 96, 56);
  private final List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

  @Test
  public void testStream1() {
    new StreamExamples().example1(numbers)
                        .example2(numbers)
                        .example3(numbers)
                        .example4(numbers);
  }

  @Test
  public void testStream2() {
    new StreamExercises().exercise1(numbers)
                         .exercise2(numbers)
                         .exercise3(numbers)
                         .exercise4(numbers)
                         .exercise5(numbers)
                         .exercise6(courses)
                         .exercise7(courses)
                         .exercise8(numbers)
                         .exercise9(numbers)
                         .exercise10(courses)
                         .exercise11(numbers)
                         .exercise12(numbers)
                         .exercise13(numbers)
                         .exercise14(numbers);
  }
}
