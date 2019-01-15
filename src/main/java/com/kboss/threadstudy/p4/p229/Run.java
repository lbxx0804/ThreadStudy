package com.kboss.threadstudy.p4.p229;


public class Run {
    public static void main(String[] args) {
        final MyService myService = new MyService();
        Runnable runnable = new Runnable() {
            public void run() {
                myService.waitMethod();
            }
        };
        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        threadA.start();
        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
    }
}
