package com.kboss.threadstudy.p097;

public class Run {
    public static void main(String[] args) {
        StaticObject staticObject = new StaticObject();
        ThreadA threadA = new ThreadA(staticObject);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(staticObject);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
