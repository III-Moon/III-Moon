package org.example;

public class Rectangle extends AbstractShape {

  private double lineWidth;

  public Rectangle(int length, int width, double lineWidth) {
    super(length, width);
    setLineWidth(lineWidth);
  }

  public int calculateArea() {
    System.out.println("Rectangle calculate");
    return super.calculateArea();
  }

  /**
   *
   */
  @Override
  public void computeArea() {
    System.out.println("abstract compute Area");
    System.out.println(lineWidth);
  }

  public void setLineWidth(double lineWidth) {
    this.lineWidth = lineWidth;
  }


}
