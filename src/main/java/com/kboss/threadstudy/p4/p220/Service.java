package com.kboss.threadstudy.p4.p220;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
    public ReentrantLock lock = new ReentrantLock();

    public void serviceMethod() {
        try {
            lock.lock();
            System.out.println("ThreadName = " + Thread.currentThread().getName()
                    + "进入方法");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
