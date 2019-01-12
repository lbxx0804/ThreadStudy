package com.kboss.threadstudy.p4.p214;

public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA[] threadAS = new ThreadA[10];
        ThreadB[] threadBS = new ThreadB[10];
        for (int i = 0; i < 10; i++) {
            threadAS[i] = new ThreadA(myService);
            threadBS[i] = new ThreadB(myService);
            threadAS[i].start();
            threadBS[i].start();
        }

    }
}
