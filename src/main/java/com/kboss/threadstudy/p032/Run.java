package com.kboss.threadstudy.p032;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(5000);
        myThread.stop();
        System.out.println("end");
    }
}
