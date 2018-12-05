package com.kboss.threadstudy.p066;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
