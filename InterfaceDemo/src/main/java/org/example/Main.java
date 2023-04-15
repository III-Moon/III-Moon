package org.example;

import org.example.impl.DemoImplement;
import org.example.impl.SecondImpl;

public class Main {

  public static void main(String[] args) {
    TestInterface.test();
    System.out.println(TestInterface.testVariable);

    System.out.println("------Implement 1----------");
    DemoImplement demoImplement = new DemoImplement();
    demoImplement.method();
    demoImplement.showType(123);
    System.out.println(demoImplement.hasNext());

    System.out.println("------Implement 2----------");
    SecondImpl second = new SecondImpl();
    second.method();
    second.showType(123.11);
    System.out.println(second.next());
    System.out.println(second.hasNext());

//    tag interface的作用
    System.out.println(demoImplement instanceof TagInterface);
    System.out.println("Hello world!");
  }
}