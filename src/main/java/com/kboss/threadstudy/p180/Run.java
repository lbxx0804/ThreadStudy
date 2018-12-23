package com.kboss.threadstudy.p180;

public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            myThread.join();
            System.out.println("当子线程结束后打印");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
