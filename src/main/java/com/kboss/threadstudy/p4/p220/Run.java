package com.kboss.threadstudy.p4.p220;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            public void run() {
                service.serviceMethod();
            }
        };
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }
        Thread.sleep(2000);
        System.out.println("当前等待线程数：" + service.lock.getQueueLength());
    }
}
