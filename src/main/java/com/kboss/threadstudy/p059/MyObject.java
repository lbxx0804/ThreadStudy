package com.kboss.threadstudy.p059;

public class MyObject {
    synchronized public void test() {
        System.out.println("线程：" + Thread.currentThread().getName() + "启动");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
