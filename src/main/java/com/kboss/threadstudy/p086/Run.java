package com.kboss.threadstudy.p086;

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        MyThread1 myThread1 = new MyThread1(service);
        myThread1.start();
        MyThread2 myThread2 = new MyThread2(service);
        myThread2.start();
    }
}
