package com.kboss.threadstudy.p019;

public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();

    }
}
