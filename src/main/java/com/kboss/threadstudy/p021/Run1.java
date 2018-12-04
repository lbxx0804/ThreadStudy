package com.kboss.threadstudy.p021;

public class Run1 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        myThread1.setName("测试线程");
        System.out.println("begin = " + System.currentTimeMillis());
        myThread1.run();//使用run，不会异步
        System.out.println("end = " + System.currentTimeMillis());
    }
}
