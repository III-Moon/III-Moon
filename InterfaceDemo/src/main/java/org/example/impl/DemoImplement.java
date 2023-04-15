package org.example.impl;

import org.example.TestInterface;

public class DemoImplement implements TestInterface<Boolean, Integer> {

  @Override
  public boolean hasNext() {
    return false;
  }

  @Override
  public Boolean next() {
    return false;
  }

  @Override
  public void showType(Integer value) {
    System.out.println("showType" + value);
  }

  @Override
  public void method() {
    TestInterface.super.method();
  }
}
