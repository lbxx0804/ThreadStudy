package com.kboss.threadstudy.p3.p149;


public class Run {
    public static void main(String[] args) {
        Object lock = new Object();
        MyThreadA myThreadA = new MyThreadA(lock);
        myThreadA.setName("A");
        MyThreadB myThreadB = new MyThreadB(lock);
        myThreadB.setName("B");
        MyThreadC myThreadC = new MyThreadC(lock);
        myThreadC.setName("C");
        myThreadA.start();
        myThreadB.start();
        myThreadC.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
    }
}
