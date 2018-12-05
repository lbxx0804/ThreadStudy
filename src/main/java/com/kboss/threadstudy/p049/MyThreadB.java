package com.kboss.threadstudy.p049;

public class MyThreadB extends Thread {
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
