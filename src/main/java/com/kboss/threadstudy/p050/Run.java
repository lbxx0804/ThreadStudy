package com.kboss.threadstudy.p050;

public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我退出了，守护线程也停止。");
    }
}
