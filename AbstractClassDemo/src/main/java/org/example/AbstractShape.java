package org.example;

/**
 * 1. 抽象类不能被实例化(初学者很容易犯的错)，如果被实例化，就会报错，编译无法通过。只有抽象类的非抽象子类可以创建对象。<BR/>
 * 2. 抽象类中不一定包含抽象方法，但是有抽象方法的类必定是抽象类。<BR/>
 * 3. 抽象类中的抽象方法只是声明，不包含方法体，就是不给出方法的具体实现也就是方法的具体功能。<BR/>
 * 4. 构造方法，类方法（用 static 修饰的方法）不能声明为抽象方法。<BR/>
 * 5. 抽象类的子类必须给出抽象类中的抽象方法的具体实现，除非该子类也是抽象类。
 *
 * @see <a href="https://www.runoob.com/java/java-abstraction.html">抽象类</a>
 */
public abstract class AbstractShape {

  private final int length;
  private final int width;

  public AbstractShape(int length, int width) {
    System.out.println("Construct A Shape");
    this.length = length;
    this.width = width;
  }

  public int calculateArea() {
    return length * width;
  }

  //抽象方法，必须要在子类实现或者子类也为抽象类
  public abstract void computeArea();

  @Override
  public String toString() {
    return "AbstractShape{" +
        "length=" + length +
        ", width=" + width +
        '}';
  }
}
