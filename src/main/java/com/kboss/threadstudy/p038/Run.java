package com.kboss.threadstudy.p038;

public class Run {
    public static void main(String[] args) {
        final SynObject synObject = new SynObject();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                System.out.println("线程a启动");
                synObject.doSomeThing();
            }
        };
        thread1.setName("a");
        thread1.start();

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                System.out.println("线程b启动了");
                synObject.doSomeThing();
            }
        };
        thread2.start();
    }
}
