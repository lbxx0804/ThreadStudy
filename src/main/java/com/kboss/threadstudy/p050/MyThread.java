package com.kboss.threadstudy.p050;

public class MyThread extends Thread {
    private int i = 0;

    @Override
    public void run() {
        while (true) {
            i++;
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
