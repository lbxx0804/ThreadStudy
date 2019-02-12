package com.kboss.threadstudy.p4.p232;

public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        Thread.sleep(1000);
        ThreadB threadB = new ThreadB(service);
        threadB.start();
    }
}
