package com.kboss.threadstudy.p077;

public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 myThread1 = new MyThread1(task);
        myThread1.setName("A");
        MyThread2 myThread2 = new MyThread2(task);
        myThread2.setName("B");
        myThread1.start();
        myThread2.start();
    }
}
