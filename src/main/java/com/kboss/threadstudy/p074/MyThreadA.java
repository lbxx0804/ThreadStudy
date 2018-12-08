package com.kboss.threadstudy.p074;


public class MyThreadA extends Thread {
    private Service service;

    public MyThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        this.service.doSomeThing();
    }
}
