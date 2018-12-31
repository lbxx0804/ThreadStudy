package com.kboss.threadstudy.p4.p205;

public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.await();
    }
}
