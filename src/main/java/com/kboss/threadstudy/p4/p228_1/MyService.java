package com.kboss.threadstudy.p4.p228_1;

import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        if (lock.tryLock()) {
            System.out.println("Thread" + Thread.currentThread().getName() + "获得锁");
        } else {
            System.out.println("Thread" + Thread.currentThread().getName() + "未获得锁");
        }
    }
}
