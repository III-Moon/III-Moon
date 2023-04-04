package org.iii;

public class FactoryDemo {

  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();

    Shape shape1 = shapeFactory.getShape(ShapeEnum.Circle);
    shape1.draw();
    Shape shape2 = shapeFactory.getShape(ShapeEnum.Rectangle);
    shape2.draw();
    Shape shape3 = shapeFactory.getShape(ShapeEnum.Square);
    shape3.draw();

  }
}
