package com.gf.education.java.functionalInterfaces;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FuntionalProgrammingInterfacesTest {
  private final List<Integer> data;
  private static final List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

  public FuntionalProgrammingInterfacesTest() {
    data = List.of(3, 4, 6, 3, 7, 4);
  }

  @Test
  public void test1() {
    new FuncInterfacesExamples().example1(data)
                                .example2(data)
                                .example3(data)
                                .example4()
                                .example5();
  }
}
