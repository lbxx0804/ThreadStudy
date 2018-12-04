package com.kboss.threadstudy.p021;

public class Run2 {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        myThread2.setName("测试线程");
        System.out.println("begin = " + System.currentTimeMillis());
        myThread2.start();
        System.out.println("end = " + System.currentTimeMillis());
    }
}
