package com.kboss.threadstudy.p097;

public class ThreadA extends Thread {

    private StaticObject staticObject;

    public ThreadA(StaticObject staticObject) {
        super();
        this.staticObject = staticObject;
    }

    @Override
    public void run() {
        super.run();
        staticObject.test1();
    }
}
