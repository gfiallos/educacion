package com.gf.education.java.basics;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class FuntionalProgramming1 {
  private static final Logger LOG = LogManager.getLogger(FuntionalProgramming1.class);
  public static boolean printAllNumbersInListTraditional(List<Integer> pData){
    for (var i:pData){
      LOG.info(i);
    }
    return true;
  }
  public static boolean printAllNumbersInListFunctional(List<Integer> pData){
    pData.forEach(LOG::info);
    return true;
  }
}
