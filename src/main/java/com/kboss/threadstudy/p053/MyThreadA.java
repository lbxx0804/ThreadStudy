package com.kboss.threadstudy.p053;

public class MyThreadA extends Thread {
    private HasSelfPrivateNum hasSelfPrivateNum;


    public MyThreadA(HasSelfPrivateNum hasSelfPrivateNum) {
        super();
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        this.hasSelfPrivateNum.addI("a");
    }

}
