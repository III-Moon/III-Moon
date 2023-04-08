package org.example;

/**
 * 无论一个类生成了多少个对象，所有这些对象共同使用唯一一份静态的成员变量；一个对象对该静态成员变量进行了修改，其他对象的该静态成员变量的值也会随之发生变化。
 *
 * @see <a href="https://juejin.cn/post/7217346593502314553">static介绍</a>
 */
public class StaticVariableTest {

  //  静态变量
  public static String name;

  public static void main(String[] args) {
    Demo3 demo3 = new Demo3();
    demo3.B();
  }
}

class Demo2 {

  void A() {
    StaticVariableTest.name = "2";
  }

}

class Demo3 extends Demo2 {

  void B() {
    StaticVariableTest.name = "3";
    System.out.println(StaticVariableTest.name);
    super.A();
    System.out.println(StaticVariableTest.name);
  }
}
