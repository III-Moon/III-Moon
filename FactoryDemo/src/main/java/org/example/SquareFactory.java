package org.example;

import org.example.impl.Square;

public class SquareFactory implements ShapeFactory {

  @Override
  public Shape getShape() {
    return new Square();
  }
}
