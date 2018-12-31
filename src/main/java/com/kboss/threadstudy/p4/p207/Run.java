package com.kboss.threadstudy.p4.p207;


public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        MyThread myThread = new MyThread(myService);
        myThread.start();
        Thread.sleep(3000);
        myService.siginal();

    }
}
