package com.kboss.threadstudy.p053;

public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
        MyThreadA myThreadA = new MyThreadA(hasSelfPrivateNum);
        MyThreadB myThreadB = new MyThreadB(hasSelfPrivateNum);
        myThreadA.start();
        myThreadB.start();

    }
}
