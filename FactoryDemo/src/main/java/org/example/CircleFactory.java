package org.example;

import org.example.impl.Circle;

public class CircleFactory implements ShapeFactory {

  @Override
  public Shape getShape() {
    return new Circle();
  }
}
