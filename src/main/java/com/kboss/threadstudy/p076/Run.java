package com.kboss.threadstudy.p076;

public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 myThread1 = new MyThread1(task);
        myThread1.start();
        MyThread2 myThread2 = new MyThread2(task);
        myThread2.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long beginTime = CommonUtils.beginTime1;
        if (CommonUtils.beginTime2 < beginTime) {
            beginTime = CommonUtils.beginTime2;
        }
        long endTime = CommonUtils.endTime1;
        if (CommonUtils.endTime2 > endTime) {
            endTime = CommonUtils.endTime2;
        }
        System.out.println("共耗时：" + (endTime - beginTime) / 1000);
    }
}
