import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CASDemo {

    // 创建一个Integer类型的原子类
    private static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) {
        List<Thread> threadList = new ArrayList<>(10);
        // 创建10个线程，每个线程中的run()方法将count累加10000次
        for (int i = 0; i < 10; i++) {
            threadList.add(new Thread(()-> {
                // 每个线程累加10000次
                for (int j = 0; j < 10000; j++) {
                    // 实现递增，incrementAndGet()方法等价于非原子操作里面的 count++
                    count.incrementAndGet();
                }
            }));
        }
        // 将10个线程启动
        for (int i = 0; i < 10; i++) {
            threadList.get(i).start();
        }

        // 让主线程休眠10秒钟，休眠10秒钟是为了让前面的10个线程全部执行完成，如果10秒钟不够，可以设置得更加长一点
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 打印count的值
        // 最终发现从控制台打印出来的结果为100000
        System.out.println(count.get());
    }
}
