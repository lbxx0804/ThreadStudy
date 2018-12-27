package com.kboss.threadstudy.p3.p182;

public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            ThreadA threadA = new ThreadA();
            threadA.start();
            threadA.join();
            System.out.println("线程B在run end处打印");
        } catch (InterruptedException ex) {
            System.out.println("线程B在catch处打印");
            ex.printStackTrace();
        }
    }
}
