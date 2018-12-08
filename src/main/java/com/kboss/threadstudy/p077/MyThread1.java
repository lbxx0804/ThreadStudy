package com.kboss.threadstudy.p077;

public class MyThread1 extends Thread {
    Task task;

    public MyThread1(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
