package com.kboss.threadstudy.p4.p219;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private ReentrantLock lock = new ReentrantLock();

    public void servieMethod1() {
        try {
            lock.lock();
            System.out.println("servieMethod1 getHoldCount="
                    + lock.getHoldCount());
            servieMethod2();
        } finally {
            lock.unlock();
        }
    }

    public void servieMethod2() {
        try {
            lock.lock();
            System.out.println("serviceMethod2 getHoldCount="
                    + lock.getHoldCount());
        } finally {
            lock.unlock();
        }
    }
}
