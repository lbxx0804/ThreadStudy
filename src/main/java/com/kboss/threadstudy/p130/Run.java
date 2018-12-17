package com.kboss.threadstudy.p130;

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadB threadB = new ThreadB(service);
        threadB.start();
        System.out.println("已经发出停止命令了");
    }
}
