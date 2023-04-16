package org.example;

import org.example.StaticInnerClassTest.NonStaticInnerClass;

public class Main {

  public static void main(String[] args) {
//    执行三次，看静态代码块、普通代码块、构造函数执行顺序以及使用次数
    System.out.println("round 1");
    StaticContextTest staticContextTest1 = new StaticContextTest();
    System.out.println("round 2");
    StaticContextTest staticContextTest2 = new StaticContextTest();
    System.out.println("round 3");
    StaticContextTest staticContextTest3 = new StaticContextTest();

//    静态内部类
    StaticInnerClassTest.InnerClass innerClass = new StaticInnerClassTest.InnerClass();
//    调用内部类函数方法
    innerClass.printNum();

//    非静态内部类，需要先实例化父对象
    StaticInnerClassTest staticInnerClassTest = new StaticInnerClassTest();
    NonStaticInnerClass nonStaticInnerClass = staticInnerClassTest.new NonStaticInnerClass();

    //访问外部类属性
    System.out.println("outerNum=" + StaticInnerClassTest.staticOuterNum);

    //访问内部类属性
    System.out.println("innerNum=" + innerClass.innerNum);
  }
}