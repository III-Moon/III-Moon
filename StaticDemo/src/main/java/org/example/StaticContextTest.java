package org.example;

/**
 * 静态代码块 > 非静态代码块 > 构造方法 > 普通方法<BR/>
 * 我们要记住以下几点：<BR/>
 * - 静态代码块，在类被加载时就会自动调用，且只会被调用一次。<BR/>
 * - 非静态代码块，在对象被创建时自动调用，每次创建对象时都会执行。<BR/>
 * - 而构造方法，每创建一个对象就会执行一次。<BR/>
 * - 如果有多个静态代码块，JVM虚拟机会按它们在类中出现的先后顺序依次执行，每个静态代码块只会被执行一次
 */
public class StaticContextTest {

  static int num = 1;

  static {
    System.out.println("Static context num: " + ++num);
//    !!Non-static field 'num2' cannot be referenced from a static context
//    System.out.println(num2++);
  }

  static {
    System.out.println("Second Static context num: " + ++num);
//    !!Non-static field 'num2' cannot be referenced from a static context
//    System.out.println(num2++);
  }

  private int num2 = 10;

  {
    System.out.println("Normal context num: " + ++num);
    System.out.println("Normal context num2: " + ++num2);
  }

  public StaticContextTest() {
    System.out.println("Construct Method");
  }

}
