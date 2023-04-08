package org.example;

public class Demo {

//  private final int a = 1;
//  void A() {
//    //1.成员变量和局部变量都不能修改；
//    a = 2;
//    final Object obj = new Object();
//    obj = new Object();
//
//    //2.final修饰的变量不能重复赋值
//    final String a;
//    a = "2";
//    a = "3";
//  }

  final void B() {
    System.out.println("TEST FINAL METHOD");
  }
}

class Demo2 extends Demo {

//  final关键字修饰的方法，无法被重写
//  'B()' cannot override 'B()' in 'org.example.Demo'; overridden method is final
//  @Override
//  void B() {
//
//  }

}

// 对于final关键字修饰的类，该类是不可以被继承的,一般应用于工具类
//final class Test {
//}
//public class Test2 extends Test {
//
//}

class Demo3 {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Demo3(String name) {
    this.name = name;
  }
}

