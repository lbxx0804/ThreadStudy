package com.kboss.threadstudy.p038;

public class SynObject {

    synchronized public void doSomeThing() {
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("线程a永远暂停了");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
