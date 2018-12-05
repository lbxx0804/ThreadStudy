package com.kboss.threadstudy.p059;

public class MyThreadB extends Thread {
    private MyObject myObject;

    public MyThreadB(MyObject myObject) {
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.test();
    }
}
