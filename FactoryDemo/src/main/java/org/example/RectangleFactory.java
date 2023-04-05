package org.example;

import org.example.impl.Rectangle;

public class RectangleFactory implements ShapeFactory {

  @Override
  public Shape getShape() {
    return new Rectangle();
  }
}
