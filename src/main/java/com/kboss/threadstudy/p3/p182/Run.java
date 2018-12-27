package com.kboss.threadstudy.p3.p182;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();
        Thread.sleep(500);
        ThreadC threadC = new ThreadC(b);
        threadC.start();
    }
}
