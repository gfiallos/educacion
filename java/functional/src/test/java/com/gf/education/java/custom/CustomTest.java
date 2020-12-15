package com.gf.education.java.custom;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CustomTest {
  private final List<Course> dataList = List.of(
          new Course().setName("Spring")
                      .setCategory("Framework")
                      .setReviewScore(98)
                      .setNoStudents(2937)
          , new Course().setName("Spring Boot")
                        .setCategory("Framework")
                        .setReviewScore(78)
                        .setNoStudents(2937)
          , new Course().setName("donNet MVC")
                        .setCategory("Framework")
                        .setReviewScore(67)
                        .setNoStudents(297)
          , new Course().setName("AWS")
                        .setCategory("Cloud")
                        .setReviewScore(68)
                        .setNoStudents(6937)
          , new Course().setName("Java")
                        .setCategory("Programming")
                        .setReviewScore(98)
                        .setNoStudents(937)
          , new Course().setName("Python")
                        .setCategory("Programming")
                        .setReviewScore(68)
                        .setNoStudents(27)
  );

  @Test
  public void custom1() {
    new CustomExamples().example1(dataList)
                        .example2(dataList)
                        .example2_1(dataList)
                        .example3(dataList)
                        .example4(dataList)
                        .example5(dataList)
                        .example6(dataList);
  }
}
