package org.example;

/**
 * - 静态内部类访问外部类的成员变量时，需要先创建外部类对象；<BR />
 * - 非静态内部类可以直接访问使用外部类的成员变量，如同使用本类中的变量；<BR />
 * - 所有的内部类访问外部类的静态变量时，可以直接通过"外部类.静态变量"的形式访问。<BR /><BR />
 * 另外，非静态内部类是一个类中嵌套着另外一个类。它有访问外部类成员的权限，通常被称为内部类。<BR />
 * 由于内部类嵌套在外部类中，因此必须首先实例化外部类，然后创建内部类的对象来实现。
 */
public class StaticInnerClassTest {

  static int staticOuterNum = 10;

  private final int outerNum = 20;

  static class InnerClass {
//    私有属性无法在类的外部直接访问
//    private int innerNum = 20;
    int innerNum = 20;

    void printNum() {

      StaticInnerClassTest staticInnerClassTest = new StaticInnerClassTest();
      //这里的this是指InnerClass内部类对象！
      System.out.println("innerNum=" + this.innerNum + ",outerAge=" + staticInnerClassTest.outerNum
          + ",outerNum=" + StaticInnerClassTest.staticOuterNum);
    }
  }

  class NonStaticInnerClass {

    void test() {
      System.out.println("nonStaticInnerClass");
    }
  }

}
