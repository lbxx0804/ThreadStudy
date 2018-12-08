package com.kboss.threadstudy.p074;

public class Service {
    public void doSomeThing() {
        synchronized (this) {
            try {
                System.out.println("线程：" + Thread.currentThread().getName() + "开始执行：" + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("线程：" + Thread.currentThread().getName() + "结束执行：" + System.currentTimeMillis());
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
