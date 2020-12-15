package com.gf.education.java.streams;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class StreamExercises {
  private static final Logger LOG = LogManager.getLogger(StreamExercises.class);

  public StreamExercises exercise1(List<Integer> pData) {
    StreamExercises.LOG.info("---exercise1---");
    StreamExercises.LOG.info("Suma de cuadrados {}", pData.stream()
                                                          .map(n -> n * n)
                                                          .reduce(0, Integer::sum));
    return this;
  }

  public StreamExercises exercise2(List<Integer> pData) {
    StreamExercises.LOG.info("---exercise2---");
    StreamExercises.LOG.info("Suma de cubos {}", pData.stream()
                                                      .map(n -> n * n * n)
                                                      .reduce(0, Integer::sum));
    return this;
  }

  public StreamExercises exercise3(List<Integer> pData) {
    StreamExercises.LOG.info("---exercise3---");
    StreamExercises.LOG.info("Suma de impares {}", pData.stream()
                                                        .filter(n -> n % 2 != 0)
                                                        .reduce(0, Integer::sum));
    return this;
  }

  public StreamExercises exercise4(List<Integer> pData) {
    StreamExercises.LOG.info("---exercise4---");
    pData.stream()
         .distinct()
         .forEach(StreamExercises.LOG::info);
    return this;
  }

  public StreamExercises exercise5(List<Integer> pData) {
    StreamExercises.LOG.info("---exercise5---");
    pData.stream()
         .sorted()
         .forEach(StreamExercises.LOG::info);
    return this;
  }

  public StreamExercises exercise8(List<Integer> pData) {
    StreamExercises.LOG.info("---exercise8---");
    StreamExercises.LOG.info("MAX: {}", pData.stream()
                                             .max(Comparator.naturalOrder()));
    return this;
  }

  public StreamExercises exercise9(List<Integer> pData) {
    StreamExercises.LOG.info("---exercise9---");
    StreamExercises.LOG.info(pData.stream()
                                  .filter(n -> n % 2 == 0)
                                  .collect(Collectors.toList()));
    return this;
  }

  public StreamExercises exercise11(List<Integer> pData) {
    StreamExercises.LOG.info("---exercise11---");
    StreamExercises.LOG.info(pData.stream()
                                  .reduce(0, Integer::sum));
    return this;
  }

  public StreamExercises exercise12(List<Integer> pData) {
    StreamExercises.LOG.info("---exercise12---");
    BinaryOperator<Integer> sumOper = new BinaryOperator<Integer>() {
      @Override
      public Integer apply(Integer pInteger, Integer pInteger2) {
        return pInteger + pInteger2;
      }
    };
    StreamExercises.LOG.info(pData.stream()
                                  .reduce(0, sumOper));
    return this;
  }

  public StreamExercises exercise13(List<Integer> pData) {
    StreamExercises.LOG.info("---exercise13---");
    BinaryOperator<Integer> sumOper = (pInteger, pInteger2) -> pInteger + pInteger2;
    StreamExercises.LOG.info(pData.stream()
                                  .reduce(0, sumOper));
    return this;
  }

  public StreamExercises exercise14(List<Integer> pData) {
    StreamExercises.LOG.info("---exercise14---");
    StreamExercises.LOG.info(pData.stream()
                                  .reduce(0, (pInteger, pInteger2) -> pInteger + pInteger2));
    return this;
  }

  public StreamExercises exercise6(List<String> pData) {
    StreamExercises.LOG.info("---exercise6---");
    pData.stream()
         .sorted(Comparator.reverseOrder())
         .forEach(StreamExercises.LOG::info);
    return this;
  }

  public StreamExercises exercise7(List<String> pData) {
    StreamExercises.LOG.info("---exercise7---");
    pData.stream()
         .sorted(Comparator.comparing(str -> str.length()))
         .forEach(StreamExercises.LOG::info);
    return this;
  }

  public StreamExercises exercise10(List<String> pData) {
    StreamExercises.LOG.info("---exercise10---");
    StreamExercises.LOG.info(pData.stream()
                                  .map(s -> s.length())
                                  .sorted()
                                  .collect(Collectors.toList()));
    return this;
  }
}
