package com.kboss.threadstudy.p016;

public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("test线程");
        myThread.start();
    }
}
