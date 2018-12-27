package com.kboss.threadstudy.p3.p139;

public class MyThreadB extends Thread {
    private Object lock;

    public MyThreadB(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                for (int i = 0; i < 10; i++) {
                    MyList.add();
                    if (MyList.size() == 5) {
                        lock.notify();
                        System.out.println("已经发出停止通知。");
                    }
                    System.out.println("已经添加：" + (i + 1) + "个元素了！");
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}