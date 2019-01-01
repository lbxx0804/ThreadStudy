package com.kboss.threadstudy.p4.p208;

public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.awaitA();
    }
}
