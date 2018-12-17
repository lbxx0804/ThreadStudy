package com.kboss.threadstudy.p149;

public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("开始进入wait：" + Thread.currentThread().getName());
                lock.wait();
                System.out.println("结束wait:" + Thread.currentThread().getName());
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
