package com.kboss.threadstudy.p059;

public class MyThreadA extends Thread {
    private MyObject myObject;

    public MyThreadA(MyObject myObject) {
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.test();
    }
}
