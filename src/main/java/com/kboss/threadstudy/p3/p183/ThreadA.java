package com.kboss.threadstudy.p3.p183;

public class ThreadA extends Thread {
    @Override
    public void run() {
        System.out.println("开始时间:" + System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("run结束时间" + System.currentTimeMillis());
    }
}
