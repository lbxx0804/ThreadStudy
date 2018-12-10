package com.kboss.threadstudy.p107;

import com.kboss.threadstudy.p053.Run;

public class DeadThadTest implements Runnable {
    private Object object1 = new Object();
    private Object object2 = new Object();

    private String userName;

    public void setFlag(String userName) {
        this.userName = userName;
    }

    @Override
    public void run() {

    }
}
