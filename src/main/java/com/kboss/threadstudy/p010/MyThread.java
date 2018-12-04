package com.kboss.threadstudy.p010;

public class MyThread extends Thread {
    private int count = 5;

    @Override
    public void run() {
        super.run();
        count--;
        try {
            Thread.sleep(10);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("线程：" + this.currentThread().getName() + "计算：" + count);
    }
}
