package com.kboss.threadstudy.p183;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        ThreadA threadA = new ThreadA();
        threadA.start();
        threadA.join(2000);
        System.out.println("main结束时间：" + System.currentTimeMillis());
    }
}
