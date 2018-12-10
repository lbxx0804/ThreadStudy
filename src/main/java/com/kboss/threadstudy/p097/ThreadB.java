package com.kboss.threadstudy.p097;

import com.kboss.threadstudy.p068.Run;

public class ThreadB extends Thread {
    private StaticObject staticObject;

    public ThreadB(StaticObject staticObject) {
        super();
        this.staticObject = staticObject;
    }

    @Override
    public void run() {
        super.run();
        this.staticObject.test2();
    }
}
