package com.kboss.threadstudy.p008;

public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
