package com.kboss.threadstudy.p187;

public class ThreadC extends Thread {
    private ThreadB b;

    public ThreadC(ThreadB b) {
        this.b = b;
    }

    @Override
    public void run() {
        b.bService();
    }
}
