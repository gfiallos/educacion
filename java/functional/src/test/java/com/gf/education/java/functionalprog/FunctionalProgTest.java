package com.gf.education.java.functionalprog;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FunctionalProgTest {
  private static final List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

  @Test
  public void test1() {
    new FunctionalProgExamples().example1()
                                .example2(FunctionalProgTest.courses)
                                .example3()
                                .example4()
                                .example5();
  }
}
