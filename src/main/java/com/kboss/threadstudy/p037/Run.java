package com.kboss.threadstudy.p037;

public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setI(0);
        myThread.start();
        try {
            Thread.sleep(1000);
            myThread.suspend();
            System.out.println("线程暂停：" + System.currentTimeMillis() + "------" + myThread.getI());
            Thread.sleep(1000);
            System.out.println("线程暂停：" + System.currentTimeMillis() + "------" + myThread.getI());
            myThread.resume();
            System.out.println("线程启动");
            Thread.sleep(1000);
            myThread.suspend();
            System.out.println("线程暂停：" + System.currentTimeMillis() + "------" + myThread.getI());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
