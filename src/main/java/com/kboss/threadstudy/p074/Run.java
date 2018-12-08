package com.kboss.threadstudy.p074;

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        myThreadA.setName("A");
        MyThreadB myThreadB = new MyThreadB(service);
        myThreadB.setName("B");
        myThreadA.start();
        myThreadB.start();
    }
}
