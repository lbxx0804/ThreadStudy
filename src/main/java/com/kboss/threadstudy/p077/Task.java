package com.kboss.threadstudy.p077;

public class Task {
    public void doLongTimeTask() {
        for (int i = 0; i < 100; i++) {
            System.out.println("异步执行：" + Thread.currentThread().getName() + "i=" + i);
        }
        System.out.println("");
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println("同步执行：" + Thread.currentThread().getName() + "i=" + i);
            }
        }
    }
}
