package org.example;

public class Main {

  public static void main(String[] args) {
//  对于final修饰的引用类型变量，虽然其地址值不能改变，但指向对象的内容可以改变
    final Demo3 demo = new Demo3("123");
    System.out.println(demo.getName());
    demo.setName("456");
    System.out.println(demo.getName());

  }
}