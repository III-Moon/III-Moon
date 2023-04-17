package org.example;

public class Plate<T> {

  private T item;

  Plate(T t) {
    item = t;
  }
  T getT() {
    return item;
  }

  void setT(T t) {
    item = t;
  }
}
