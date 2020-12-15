package com.gf.education.java.basics;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class FuntionalProgramming3 {
  private static final Logger LOG = LogManager.getLogger(FuntionalProgramming3.class);

  public FuntionalProgramming3 example1(List<Integer> pData) {
    pData.stream()
         .map(n -> n * n)
         .forEach(FuntionalProgramming3.LOG::info);
    return this;
  }

  public FuntionalProgramming3 exercise1(List<Integer> pData) {
    FuntionalProgramming3.LOG.info("---Exercise 1---");
    pData.stream()
         .filter(n -> n % 2 != 0)
         .map(n -> n * n * n)
         .forEach(FuntionalProgramming3.LOG::info);
    return this;
  }

  public FuntionalProgramming3 exercise2(List<String> pData) {
    FuntionalProgramming3.LOG.info("---Exercise 2---");
    pData.stream()
         .map(n -> n + " " + n.length())
         .forEach(FuntionalProgramming3.LOG::info);
    return this;
  }
}
