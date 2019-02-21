package com.kboss.threadstudy.p6.p272;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
