package com.gf.education.java.basics;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class FuntionalProgramming2 {
  private static final Logger LOG = LogManager.getLogger(FuntionalProgramming2.class);

  public static boolean printEvenStructured(List<Integer> pList) {
    for (var i : pList) {
      if (i % 2 == 0) {
        FuntionalProgramming2.LOG.info(i);
      }
    }
    return true;
  }

  public static boolean printEvenFuntional(List<Integer> pList) {
    pList.stream()
         .filter(p -> p % 2 == 0)
         .forEach(FuntionalProgramming2.LOG::info);

    return true;
  }

  public static boolean exercise1(List<Integer> pList) {
    FuntionalProgramming2.LOG.debug("exercise1");
    pList.stream()
         .filter(p -> p % 2 != 0)
         .forEach(FuntionalProgramming2.LOG::info);

    return true;
  }


  public static boolean exercise2(List<String> pData) {
    FuntionalProgramming2.LOG.debug("exercise2");
    pData.forEach(FuntionalProgramming2.LOG::debug);
    return true;
  }

  public static boolean exercise3(List<String> pData) {
    FuntionalProgramming2.LOG.debug("exercise3");
    pData.stream()
         .filter(r -> r.contains("Spring"))
         .forEach(FuntionalProgramming2.LOG::debug);
    return true;
  }

  public static boolean exercise4(List<String> pData) {
    FuntionalProgramming2.LOG.debug("exercise4");
    pData.stream()
         .filter(r -> r.length() >= 4)
         .forEach(FuntionalProgramming2.LOG::debug);
    return true;
  }
}
