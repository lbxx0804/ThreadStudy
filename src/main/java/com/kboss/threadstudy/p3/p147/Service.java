package com.kboss.threadstudy.p3.p147;

public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("开始wait");
                lock.wait();
                System.out.println("结束wait");
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
            System.out.println("出现异常，因为线程被Interrupted");
        }
    }
}
