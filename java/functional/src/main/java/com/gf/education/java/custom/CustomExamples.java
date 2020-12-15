package com.gf.education.java.custom;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomExamples {
  private static final Logger LOG = LogManager.getLogger(CustomExamples.class);

  public CustomExamples example1(List<Course> pDataList) {
    CustomExamples.LOG.info("---example1---");
    CustomExamples.LOG.info("allMatch Courses have score > 75: {}", pDataList.stream()
                                                                             .allMatch(c -> c.getReviewScore() > 75));
    CustomExamples.LOG.info("noneMatch Courses have score > 75: {}", pDataList.stream()
                                                                              .noneMatch(c -> c.getReviewScore() > 75));
    CustomExamples.LOG.info("anyMatch Courses have score > 75: {}", pDataList.stream()
                                                                             .anyMatch(c -> c.getReviewScore() > 75));
    return this;
  }

  public CustomExamples example2(List<Course> pDataList) {
    CustomExamples.LOG.info("---example2---");
    CustomExamples.LOG.info("-NO Students-");
    pDataList.stream()
             .sorted(Comparator.comparing(Course::getNoStudents))
             .forEach(CustomExamples.LOG::info);
    CustomExamples.LOG.info("-NO Students Reversed-");
    pDataList.stream()
             .sorted(Comparator.comparing(Course::getNoStudents)
                               .reversed())
             .forEach(CustomExamples.LOG::info);
    CustomExamples.LOG.info("-NO Students Reversed then Review Score-");

    pDataList.stream()
             .sorted(Comparator.comparing(Course::getNoStudents)
                               .reversed()
                               .thenComparing(Course::getReviewScore))
             .forEach(CustomExamples.LOG::info);
    return this;
  }

  public CustomExamples example2_1(List<Course> pDataList) {
    CustomExamples.LOG.info("---example2_1---");
    CustomExamples.LOG.info("-NO Students-");
    pDataList.stream()
             .sorted(Comparator.comparingInt(Course::getNoStudents))
             .forEach(CustomExamples.LOG::info);
    CustomExamples.LOG.info("-NO Students Reversed-");
    pDataList.stream()
             .sorted(Comparator.comparingInt(Course::getNoStudents)
                               .reversed())
             .forEach(CustomExamples.LOG::info);
    CustomExamples.LOG.info("-NO Students Reversed then Review Score-");

    pDataList.stream()
             .sorted(Comparator.comparingInt(Course::getNoStudents)
                               .reversed()
                               .thenComparingInt(Course::getReviewScore))
             .forEach(CustomExamples.LOG::info);
    return this;
  }

  public CustomExamples example3(List<Course> pDataList) {
    CustomExamples.LOG.info("---example3---");
    CustomExamples.LOG.info("---First 4---");
    pDataList.stream()
             .sorted(Comparator.comparing(Course::getNoStudents))
             .limit(4)
             .forEach(CustomExamples.LOG::info);
    CustomExamples.LOG.info("---First 4 skipping the first 2---");
    pDataList.stream()
             .sorted(Comparator.comparing(Course::getNoStudents))
             .skip(2)
             .limit(4)
             .forEach(CustomExamples.LOG::info);
    CustomExamples.LOG.info("---Buscar hasta que... ---");
    pDataList.stream()
             .sorted(Comparator.comparing(Course::getReviewScore)
                               .reversed())
             .takeWhile(c -> c.getReviewScore() >= 78)
             .forEach(CustomExamples.LOG::info);
    CustomExamples.LOG.info("---Omitir hasta que... ---");
    pDataList.stream()
             .sorted(Comparator.comparing(Course::getReviewScore))
             .dropWhile(c -> c.getReviewScore() >= 78)
             .forEach(CustomExamples.LOG::info);
    return this;
  }

  public CustomExamples example4(List<Course> pDataList) {
    CustomExamples.LOG.info("---example4---");
    CustomExamples.LOG.info("---MAX---");
    pDataList.stream()
             .max(Comparator.comparing(Course::getNoStudents))
             .ifPresent(CustomExamples.LOG::info);
    CustomExamples.LOG.info("---MIN---");
    pDataList.stream()
             .min(Comparator.comparing(Course::getNoStudents))
             .ifPresent(CustomExamples.LOG::info);
    CustomExamples.LOG.info("---Find First---");
    pDataList.stream()
             .filter(x -> x.getReviewScore() > 90)
             .findFirst()
             .ifPresent(CustomExamples.LOG::info);
    CustomExamples.LOG.info("---Find Any---");
    pDataList.stream()
             .filter(x -> x.getReviewScore() > 90)
             .findAny()
             .ifPresent(CustomExamples.LOG::info);

    return this;
  }

  public CustomExamples example5(List<Course> pDataList) {
    CustomExamples.LOG.info("---example5---");
    CustomExamples.LOG.info("---Sum---:{}",
            pDataList.stream()
                     .mapToInt(c -> c.getNoStudents())
                     .sum());
    CustomExamples.LOG.info("---Count---:{}",
            pDataList.stream()
                     .mapToInt(c -> c.getNoStudents())
                     .count());
    CustomExamples.LOG.info("---Average---");
    pDataList.stream()
             .mapToInt(c -> c.getNoStudents())
             .average()
             .ifPresent(CustomExamples.LOG::info);

    return this;
  }

  public CustomExamples example6(List<Course> pDataList) {
    CustomExamples.LOG.info("---example6---");
    CustomExamples.LOG.info("---Grouping---");
    CustomExamples.LOG.info(pDataList.stream()
                                     .collect(Collectors.groupingBy(Course::getCategory)));
    CustomExamples.LOG.info("---Grouping 1---");
    CustomExamples.LOG.info(pDataList.stream()
                                     .collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));
    CustomExamples.LOG.info("---Grouping 2---");
    CustomExamples.LOG.info(pDataList.stream()
                                     .collect(Collectors.groupingBy(Course::getCategory, Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));
    CustomExamples.LOG.info("---Grouping 3---");
    CustomExamples.LOG.info(pDataList.stream()
                                     .collect(Collectors.groupingBy(Course::getCategory, Collectors.mapping(Course::getName, Collectors.toList()))));
    return this;
  }
}
