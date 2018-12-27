package com.kboss.threadstudy.p4.p200;

public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThread m1 = new MyThread(myService);
        MyThread m2 = new MyThread(myService);
        MyThread m3 = new MyThread(myService);
        m1.start();
        m2.start();
        m3.start();
    }
}
