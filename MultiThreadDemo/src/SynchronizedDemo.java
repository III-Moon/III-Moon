public class SynchronizedDemo {
    private int val;

    private int res;

//    修饰普通方法：锁住的是当前对象，如果一个线程进入了这个方法，那么其他线程不能再进入这个方法或者此类其他的被synchronized修饰的方法，但是可以进入普通的没有被synchronized修饰的方法。
    private synchronized void add(int val) {
        this.res += val;
    }

//    修饰静态方法：锁住的是当前类的对应的Class对象，如果一个线程进入了这个方法，那么其他线程不能进入这个类的被synchronized锁住的静态方法，但是可以进入非静态的方法。
//    private static synchronized void add(int val){
//        this.res+=val;
//    }
}
