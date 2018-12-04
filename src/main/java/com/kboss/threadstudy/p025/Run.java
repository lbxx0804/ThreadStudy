package com.kboss.threadstudy.p025;

public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            Thread.sleep(1000);
            myThread.interrupt();
            System.out.println("是否停止1?=" + myThread.interrupted());//interrupted 是静态方法，返回的currentThread当前状态
            System.out.println("是否停止2?=" + myThread.interrupted());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
