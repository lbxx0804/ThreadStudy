package com.kboss.threadstudy.p4.p214;

public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        for (int i = 0; i < 10; i++) {
            ThreadA threadA = new ThreadA(myService);
            threadA.start();
            ThreadB threadB = new ThreadB(myService);
            threadB.start();
        }
    }
}
