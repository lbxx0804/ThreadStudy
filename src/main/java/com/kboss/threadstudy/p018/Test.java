package com.kboss.threadstudy.p018;

public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("Start前：" + myThread.isAlive());
        myThread.start();
        System.out.println("Start后：" + myThread.isAlive());
        try {
            Thread.sleep(5000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Sleep5秒后：" + myThread.isAlive());
    }
}
