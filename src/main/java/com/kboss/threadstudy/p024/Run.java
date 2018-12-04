package com.kboss.threadstudy.p024;

public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            Thread.sleep(2000);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        myThread.interrupt();;//退出线程
    }
}
