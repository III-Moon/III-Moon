package org.example;

import java.util.stream.IntStream;

/**
 * ThreadLocal 叫做本地线程变量，意思是说，ThreadLocal 中填充的的是当前线程的变量，该变量对其他线程而言是封闭且隔离的，ThreadLocal 为变量在每个线程中创建了一个副本，这样每个线程都可以访问自己内部的副本变量。<p />
 * 1、在进行对象跨层传递的时候，使用ThreadLocal可以避免多次传递，打破层次间的约束。<br/>
 * 2、线程间数据隔离<br/>
 * 3、进行事务操作，用于存储线程事务信息。<br/>
 * 4、数据库连接，Session会话管理。<br/>
 */
public class ThreadocalDemo {
    public static void main(String[] args) {
        ThreadLocal<String> local = new ThreadLocal<>();

        IntStream.range(0, 10).forEach(i -> new Thread(() -> {
//            ThreadLocal内变量跟随当前线程走
            local.set(Thread.currentThread().getName() + ":" + i);
            System.out.println("线程：" + Thread.currentThread().getName() + ",local:" + local.get());
        }).start());
    }
}
