package com.kboss.threadstudy.p147;

public class Run {
    public static void main(String[] args) {
        Object lock = new Object();
        MyThread myThread = new MyThread(lock);
        myThread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread.interrupt();
    }
}
