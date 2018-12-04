package com.kboss.threadstudy.p016;

public class MyThread extends Thread {
    public MyThread(String name) {
        super();
        this.setName(name);
        System.out.println("构造函数中线程名称：" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Run方法中线程名称：" + Thread.currentThread().getName());
    }
}
