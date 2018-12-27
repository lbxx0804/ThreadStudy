package com.kboss.threadstudy.p3.p187;

public class ThreadA extends Thread {
    private ThreadB b;

    public ThreadA(ThreadB b) {
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b) {
                b.start();
                //Thread.sleep(6000);//不会释放锁
                b.join();//实现使用了wait，所以会释放锁
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    String s = new String();
                    Math.random();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
