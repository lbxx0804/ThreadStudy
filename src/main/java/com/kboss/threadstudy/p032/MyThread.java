package com.kboss.threadstudy.p032;

public class MyThread extends Thread {
    private int i = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println(i++);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
