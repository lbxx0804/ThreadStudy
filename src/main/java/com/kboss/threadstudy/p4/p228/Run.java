package com.kboss.threadstudy.p4.p228;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final MyService myService = new MyService();
        Runnable runnable = new Runnable() {
            public void run() {
                myService.waitMethod();
            }
        };
        Thread thread = new Thread(runnable);
        thread.setName("A");
        thread.start();
        Thread.sleep(500);
        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
        threadB.interrupt();//打标记
        System.out.println("main end");
    }
}
