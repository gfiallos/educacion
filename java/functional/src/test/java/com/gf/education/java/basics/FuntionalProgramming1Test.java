package com.gf.education.java.basics;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;


class FuntionalProgramming1Test {
private List<Integer> data;
  @BeforeEach
  void setUp() {
    data=List.of(3,4,6,3,7,4);
  }

  @Test
  void printAllNumbersInListTraditional() {
    Assertions.assertTrue(FuntionalProgramming1.printAllNumbersInListTraditional(data));
  }

  @Test
  void printAllNumbersInListFunctional() {
    Assertions.assertTrue(FuntionalProgramming1.printAllNumbersInListFunctional(data));
  }
}