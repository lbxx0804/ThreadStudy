package com.kboss.threadstudy.p025;

public class Run3 {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(30);
            myThread.interrupt();
            System.out.println("是否停止1=" + myThread.isInterrupted());
            System.out.println("是否停止2=" + myThread.isInterrupted());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("end");
    }
}
