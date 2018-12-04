package com.kboss.threadstudy.p027;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5000000; i++) {
            if (this.interrupted()) {
                System.out.println("已经处于停止状态了，我要退出了");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
    }
}
