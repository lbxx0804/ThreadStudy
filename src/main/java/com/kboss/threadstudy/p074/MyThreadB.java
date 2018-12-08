package com.kboss.threadstudy.p074;

public class MyThreadB extends Thread {
    private Service service;

    public MyThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        this.service.doSomeThing();
    }
}
