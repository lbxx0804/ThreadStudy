package com.kboss.threadstudy.p011;

public class MyThread extends Thread {
    private int count = 5;

    @Override
    synchronized public void run() {
        count--;
        try {
            Thread.sleep(100);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("当前线程：" + this.currentThread().getName() + "执行计算：" + count);
    }
}
