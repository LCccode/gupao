package com.example.gupao.principle.singletone;

public class LazySimpleSingletonTest {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExcutorThread());
        Thread thread2 = new Thread(new ExcutorThread());
        thread1.start();
        thread2.start();
        System.out.println("end");
    }

}
class ExcutorThread implements Runnable{

    @Override
    public void run() {
        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "：" + lazySimpleSingleton);
    }
}