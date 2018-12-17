package com.kboss.threadstudy.p130;

public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.stopMethod();
    }
}
