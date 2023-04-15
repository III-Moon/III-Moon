package org.example;

/**
 * 在 JDK1.8，允许我们给接口添加两种非抽象的方法实现：<BR />
 * 1、默认方法，添加 default 修饰即可；<BR />
 * 2、静态方法，使用 static 修饰；<P />
 *
 * 在尖括号中填写类型参数，参数可以有多个，多个参数使用逗号分隔<BR />
 * T表示的是任意类型  type<BR />
 * E表示的是元素的类型 element<BR />
 * K表示的是key/value中的key<BR />
 * 表示的是key/value中的value<BR />
 *
 * @param <E> the type of returned element
 */
public interface TestInterface<E, T> extends TagInterface {

  //  静态变量 public static final
  String testVariable = "静态变量";

  //  静态方法
  static void test() {
    System.out.println("静态方法被实现了");
  }

  //  抽象方法 public abstract
  boolean hasNext();

  E next();

  void showType(T value);

  //  默认方法
  default void method() {
    System.out.println("默认方法被实现了");
  }
}
