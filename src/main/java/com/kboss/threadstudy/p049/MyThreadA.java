package com.kboss.threadstudy.p049;

import java.util.concurrent.CountDownLatch;

public class MyThreadA extends Thread {

    private int i = 0;

    public int getI() {
        return i;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            i++;
        }
    }
}
