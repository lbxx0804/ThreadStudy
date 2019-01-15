package com.kboss.threadstudy.p4.p232;

public class Run1 {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
    }
}
