package org.example;

public class Main {

  public static void main(String[] args) {
    ShapeFactory factory = new RectangleFactory();
    Shape shape = factory.getShape();
    shape.draw();

    ShapeFactory factory1 = new CircleFactory();
    Shape shape1 = factory1.getShape();
    shape1.draw();

    ShapeFactory factory2 = new SquareFactory();
    Shape shape2 = factory2.getShape();
    shape2.draw();

  }
}