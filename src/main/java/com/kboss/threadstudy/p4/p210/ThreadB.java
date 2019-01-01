package com.kboss.threadstudy.p4.p210;

public class ThreadB extends Thread {
    private MyService myService;

    public ThreadB(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.awaitB();
    }
}
