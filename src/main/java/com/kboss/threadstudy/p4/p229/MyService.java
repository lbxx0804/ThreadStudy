package com.kboss.threadstudy.p4.p229;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)) {
                System.out.println("线程：" + Thread.currentThread().getName() + "获得锁");
                Thread.sleep(1000);
            } else {
                System.out.println("线程：" + Thread.currentThread().getName() + "未获得锁");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}
