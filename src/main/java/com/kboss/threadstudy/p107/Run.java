package com.kboss.threadstudy.p107;

public class Run {
    public static void main(String[] args) {
        try {
            DeadThadTest t1 = new DeadThadTest();
            Thread thread1 = new Thread(t1);
            t1.setFlag("a");
            thread1.start();
            Thread.sleep(100);
            Thread thread2 = new Thread(t1);
            t1.setFlag("b");
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
