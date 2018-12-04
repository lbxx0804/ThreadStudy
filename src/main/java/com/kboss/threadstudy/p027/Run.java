package com.kboss.threadstudy.p027;

public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            Thread.sleep(500);
            myThread.interrupt();
            System.out.println("end");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
