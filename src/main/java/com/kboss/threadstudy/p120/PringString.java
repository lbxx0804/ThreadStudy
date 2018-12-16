package com.kboss.threadstudy.p120;

public class PringString implements Runnable {
    private boolean isContinuePrint = true;

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean isContinuePrint) {
        this.isContinuePrint = isContinuePrint;
    }

    public void printStringMethod() {
        try {
            while (isContinuePrint == true) {
                System.out.println("run pringStringMethod 线程名称为：" + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void run() {
        printStringMethod();
    }
}
