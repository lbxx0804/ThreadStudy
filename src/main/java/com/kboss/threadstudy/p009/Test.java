package com.kboss.threadstudy.p009;

public class Test {
    public static void main(String[] args) {
        MyThread m1 = new MyThread("线程1");
        MyThread m2 = new MyThread("线程2");
        MyThread m3 = new MyThread("线程3");
        MyThread m4 = new MyThread("线程4");
        MyThread m5 = new MyThread("线程5");
        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
    }
}
