package com.kboss.threadstudy.p149;

public class MyThreadC extends Thread {
    private Object lock;

    public MyThreadC(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
