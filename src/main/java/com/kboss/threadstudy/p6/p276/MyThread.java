package com.kboss.threadstudy.p6.p276;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.connectionFactory.getConnection());
    }
}
