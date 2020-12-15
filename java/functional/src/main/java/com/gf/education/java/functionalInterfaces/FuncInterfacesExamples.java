package com.gf.education.java.functionalInterfaces;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Random;
import java.util.function.*;

public class FuncInterfacesExamples {
  private static final Logger LOG = LogManager.getLogger(FuncInterfacesExamples.class);

  public FuncInterfacesExamples example1(List<Integer> pData) {
    FuncInterfacesExamples.LOG.info("---example1---");
    Predicate<Integer> isEven = x -> x % 2 == 0;
    var isEven2 = new Predicate<Integer>() {
      @Override
      public boolean test(Integer pInteger) {
        return pInteger % 2 == 0;
      }
    };
    Function<Integer, ? super Integer> squares = x -> x * x;
    Function<Integer, ? super Integer> squares2 = new Function<Integer, Integer>() {
      @Override
      public Integer apply(Integer pInteger) {
        return pInteger * pInteger;
      }
    };
    Consumer<Integer> cons = new Consumer<Integer>() {
      @Override
      public void accept(Integer pInteger) {
        FuncInterfacesExamples.LOG.info(pInteger);
      }
    };
    BinaryOperator<Integer> sumOf = (x, y) -> x + y;
    //No input -- Return
    Supplier<Integer> random = () -> new Random().nextInt();
    FuncInterfacesExamples.LOG.info("Supplier: {}", random.get());
    UnaryOperator<Integer> unaryOperator = x -> x * x;
    FuncInterfacesExamples.LOG.info("UnaryOperator: {}", unaryOperator.apply(18));
    pData.stream()
         .filter(isEven)
         .filter(isEven2)
         .map(squares)
         .forEach(FuncInterfacesExamples.LOG::info);
    return this;
  }

  public FuncInterfacesExamples example4() {
    FuncInterfacesExamples.LOG.info("---example4---");

    BiPredicate<Integer, Integer> biPredicate = (x, y) -> x > y;
    FuncInterfacesExamples.LOG.info("BiPredicate: {}", biPredicate.test(10, 38));
    BiFunction<Integer, Integer, String> biFunction = (x, y) -> x + " " + y;
    FuncInterfacesExamples.LOG.info("BiFunction: {}", biFunction.apply(10, 36));
    BiConsumer<Integer, String> biConsumer = (x, y) -> FuncInterfacesExamples.LOG.info("BiConsumer: {}-{}", x, y);
    biConsumer.accept(10, "Prueba");
    return this;
  }

  public FuncInterfacesExamples example2(List<Integer> pData) {
    FuncInterfacesExamples.LOG.info("---example2---");
    this.printList(pData, x -> x % 2 == 0);
    return this;
  }

  public FuncInterfacesExamples example3(List<Integer> pData) {
    FuncInterfacesExamples.LOG.info("---example3---");
    FuncInterfacesExamples.LOG.info("---squared---");
    this.calculate(pData, x -> x * x);
    FuncInterfacesExamples.LOG.info("---cube---");
    this.calculate(pData, x -> x * x * x);
    return this;
  }

  private void printList(List<Integer> pData, Predicate<Integer> pIntegerPredicate) {
    pData.stream()
         .filter(pIntegerPredicate)
         .forEach(FuncInterfacesExamples.LOG::info);
  }

  private void calculate(List<Integer> pData, Function<Integer, Integer> pIntegerFunction) {
    pData.stream()
         .map(pIntegerFunction)
         .forEach(FuncInterfacesExamples.LOG::info);
  }

  public FuncInterfacesExamples example5() {
    FuncInterfacesExamples.LOG.info("---example5---");

    IntBinaryOperator sum1 = (x, y) -> x * y;
    FuncInterfacesExamples.LOG.info("IntBinaryOperator: {}", sum1.applyAsInt(12, 34));
    IntToDoubleFunction intToDoubleFunction = x -> x / 100.0;
    FuncInterfacesExamples.LOG.info("IntToDoubleFunction: {}", intToDoubleFunction.applyAsDouble(34));

    return this;
  }
}
