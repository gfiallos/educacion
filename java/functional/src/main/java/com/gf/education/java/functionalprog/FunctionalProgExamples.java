package com.gf.education.java.functionalprog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class FunctionalProgExamples {
  private static final Logger LOG = LogManager.getLogger(FunctionalProgExamples.class);

  public FunctionalProgExamples example1() {
    FunctionalProgExamples.LOG.info("---example1---");
    FunctionalProgExamples.LOG.info("Sum: {}",
            LongStream.range(0, 100000000)
                      .sum());
    FunctionalProgExamples.LOG.info("Sum - Parallel: {}",
            LongStream.range(0, 100000000)
                      .parallel()
                      .sum());
    return this;
  }

  public FunctionalProgExamples example2(List<String> pCourses) {
    var modifyableList = new ArrayList<>(pCourses);
    FunctionalProgExamples.LOG.info("---example2---");
    modifyableList.replaceAll(String::toUpperCase);
    FunctionalProgExamples.LOG.info(modifyableList);
    modifyableList.removeIf(c -> c.contains("SPRING"));
    FunctionalProgExamples.LOG.info(modifyableList);
    return this;
  }

  public FunctionalProgExamples example3() {
    try {
      FunctionalProgExamples.LOG.info("---example3---");
      Files.lines(Paths.get("/Users/german/Fuentes/Inttegrio/jdk9/jdk9/inttegrio/persistence/tables.txt"))
           .map(s -> s.split("/java/"))
           .flatMap(Arrays::stream)
           .distinct()
           .sorted()
           .limit(4)
           .forEach(FunctionalProgExamples.LOG::info);
    } catch (Exception e) {
      FunctionalProgExamples.LOG.error("Error", e);
    }
    return this;

  }

  public FunctionalProgExamples example4() {
    try {
      FunctionalProgExamples.LOG.info("---example4---");
      Files.list(Paths.get("."))
           .filter(Files::isDirectory)
           .forEach(FunctionalProgExamples.LOG::info);
    } catch (Exception e) {
      FunctionalProgExamples.LOG.error("Error", e);
    }
    return this;
  }

  public FunctionalProgExamples example5() {
    try {
      FunctionalProgExamples.LOG.info("---example5---");
      Runnable runnable = new Runnable() {
        @Override
        public void run() {
          IntStream.range(0, 10)
                   .forEach(i -> System.out.println(Thread.currentThread()
                                                          .getId() + ":" + i));
        }
      };
      Thread thread = new Thread(runnable);
      thread.start();
      Thread thread1 = new Thread(() -> IntStream.range(0, 10)
                                                 .parallel()
                                                 .forEach(i -> System.out.println(Thread.currentThread()
                                                                                        .getId() + "-Parallel-:" + i)));
      thread1.start();
    } catch (Exception e) {
      FunctionalProgExamples.LOG.error("Error", e);
    }
    return this;
  }

  public FunctionalProgExamples example6() {
    FunctionalProgExamples.LOG.info("---example6---");

    return this;
  }
}
