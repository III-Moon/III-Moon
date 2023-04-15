package org.example.impl;

import org.example.TestInterface;

public class SecondImpl implements
    TestInterface<String, Double> {

  @Override
  public boolean hasNext() {
    return false;
  }

  @Override
  public String next() {
    return "String next()";
  }

  @Override
  public void showType(Double value) {
    System.out.println("showType" + value);
  }
}
