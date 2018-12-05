package com.kboss.threadstudy.p061;

public class MyObject {
    synchronized public void testA() {
        System.out.println("线程：" + Thread.currentThread().getName() + "执行方法testA");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("A  end");
    }

    public void testB() {
        System.out.println("线程：" + Thread.currentThread().getName() + "执行方法testB");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("B end");
    }
}
