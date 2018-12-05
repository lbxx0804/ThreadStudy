package com.kboss.threadstudy.p049;

public class Run {
    public static void main(String[] args) {
        MyThreadA myThreadA = new MyThreadA();
        myThreadA.setPriority(Thread.NORM_PRIORITY - 3);
        MyThreadB myThreadB = new MyThreadB();
        myThreadB.setPriority(Thread.NORM_PRIORITY + 3);
        myThreadA.start();
        myThreadB.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThreadA.stop();
        myThreadB.stop();
        System.out.println("A:" + myThreadA.getI());
        System.out.println("B:" + myThreadB.getI());
    }
}
