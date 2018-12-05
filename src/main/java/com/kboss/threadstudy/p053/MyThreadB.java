package com.kboss.threadstudy.p053;

public class MyThreadB extends Thread {
    private HasSelfPrivateNum hasSelfPrivateNum;


    public MyThreadB(HasSelfPrivateNum hasSelfPrivateNum) {
        super();
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        this.hasSelfPrivateNum.addI("b");
    }
}
