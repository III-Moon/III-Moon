package org.example;

import java.util.List;

/**
 * 定义泛型方法的规则：
 * <p>
 * 1. 所有泛型方法声明都有一个类型参数声明部分（由尖括号分隔），该类型参数声明部分在方法返回类型之前（在下面例子中的 {@code <E>}）。<BR />
 * 2. 每一个类型参数声明部分包含一个或多个类型参数，参数间用逗号隔开。一个泛型参数，也被称为一个类型变量，是用于指定一个泛型类型名称的标识符。<BR />
 * 3. 类型参数能被用来声明返回值类型，并且能作为泛型方法得到的实际参数类型的占位符。<BR />
 * 4. 泛型方法体的声明和其他方法一样。注意类型参数只能代表引用型类型，不能是原始类型（像int、double、char 等）
 */
public class Main {

//  泛型参数
  public static <E> void printArray(E[] inputArray) {
    // 输出数组元素
    for (E element : inputArray) {
      System.out.printf("%s ", element);
    }
    System.out.println();
  }

  //  有界的泛型参数
  public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
    T max = x; // 假设x是初始最大值
    if (y.compareTo(max) > 0) {
      max = y; //y 更大
    }
    if (z.compareTo(max) > 0) {
      max = z; // 现在 z 更大
    }
    return max; // 返回最大对象
  }

  public static void main(String[] args) {
    printArray(new Integer[]{1, 2, 3, 5, 4});
    printArray(new String[]{"A", "B", "C", "D", "E"});
    printArray(new Double[]{1.0, 2.1, -3.0, 4.5, 0.0});

    System.out.println(maximum(1, 2, 3));
    System.out.println(maximum("A", "B", "C"));

    Plate<? extends String> plate = new Plate<>("12");
    String t = plate.getT();
    System.out.println(t);
  }
}