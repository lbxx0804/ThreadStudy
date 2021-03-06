package com.kboss.threadstudy.p3.p149;

public class MyThreadA extends Thread {
    private Object lock;

    public MyThreadA(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
