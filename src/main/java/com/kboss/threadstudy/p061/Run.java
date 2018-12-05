package com.kboss.threadstudy.p061;

public class Run {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        MyThreadA myThreadA = new MyThreadA(myObject);
        myThreadA.setName("线程A");
        MyThreadB myThreadB = new MyThreadB(myObject);
        myThreadB.setName("线程B");
        myThreadA.start();
        myThreadB.start();
    }
}
