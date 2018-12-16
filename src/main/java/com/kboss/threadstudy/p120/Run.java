package com.kboss.threadstudy.p120;

public class Run {
    public static void main(String[] args) {
        PringString pringString = new PringString();
        Thread thread = new Thread(pringString);
        thread.start();
        ;
        System.out.println("我要停止它" + Thread.currentThread().getName());
        pringString.setContinuePrint(false);
    }
}
