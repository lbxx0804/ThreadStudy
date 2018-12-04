package com.kboss.threadstudy.p018;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run中:" + this.isAlive());
    }
}
