package com.kboss.threadstudy.p025;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500; i++) {
            System.out.println("i=" + i);
        }
    }
}
