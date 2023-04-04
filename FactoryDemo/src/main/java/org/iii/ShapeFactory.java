package org.iii;

import org.iii.impl.Circle;
import org.iii.impl.Rectangle;
import org.iii.impl.Square;

public class ShapeFactory {

  Shape getShape(ShapeEnum shapeType) {
    switch (shapeType) {
      case Circle:
        return new Circle();
      case Square:
        return new Square();
      case Rectangle:
        return new Rectangle();
      default:
        return null;
    }
  }
}
