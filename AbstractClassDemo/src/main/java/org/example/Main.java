package org.example;

public class Main {

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(2, 3, 2.4);
    AbstractShape shape = new Rectangle(1, 3, 2.4);
    int i = rectangle.calculateArea();
    int y = shape.calculateArea();
    System.out.println(i);
    System.out.println(y);

    rectangle.computeArea();
  }
}