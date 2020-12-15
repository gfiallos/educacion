package com.gf.education.java.streams;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class StreamExamples {
  private static final Logger LOG = LogManager.getLogger(StreamExamples.class);

  public StreamExamples example1(List<Integer> pData) {
    StreamExamples.LOG.info("---example1---");
    int sum = 0;
    for (var element : pData) {
      sum += element;
    }
    StreamExamples.LOG.info("Suma: {}", sum);
    return this;
  }

  private int sum(int pActualSum, int pNextElement) {
    return pActualSum + pNextElement;

  }

  public StreamExamples example2(List<Integer> pData) {
    StreamExamples.LOG.info("---example2---");
    StreamExamples.LOG.info("Suma: {}", pData.stream()
                                             .reduce(0, this::sum));
    return this;
  }

  public StreamExamples example3(List<Integer> pData) {
    StreamExamples.LOG.info("---example3---");
    StreamExamples.LOG.info("Suma: {}", pData.stream()
                                             .reduce(0, (a, b) -> a + b));
    return this;
  }

  public StreamExamples example4(List<Integer> pData) {
    StreamExamples.LOG.info("---example4---");
    StreamExamples.LOG.info("Suma: {}", pData.stream()
                                             .reduce(0, Integer::sum));
    return this;
  }
}
