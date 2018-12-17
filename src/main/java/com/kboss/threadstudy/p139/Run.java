package com.kboss.threadstudy.p139;

public class Run {
    public static void main(String[] args) {
        Object lock = new Object();
        MyThreadA myThreadA = new MyThreadA(lock);
        myThreadA.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MyThreadB myThreadB = new MyThreadB(lock);
        myThreadB.start();
    }
}
