package com.kboss.threadstudy.p069;


public class Run {
    public static void main(String[] args) {
        Sub sub = new Sub();
        MyThreadA myThreadA = new MyThreadA(sub);
        myThreadA.setName("A");
        MyThreadB myThreadB = new MyThreadB(sub);
        myThreadB.setName("B");
        myThreadA.start();
        myThreadB.start();
    }
}
