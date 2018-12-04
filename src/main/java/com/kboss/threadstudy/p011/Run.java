package com.kboss.threadstudy.p011;

public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread,"A");
        Thread thread2 = new Thread(myThread,"B");
        Thread thread3 = new Thread(myThread,"c");
        Thread thread4 = new Thread(myThread,"d");
        Thread thread5 = new Thread(myThread,"e");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
