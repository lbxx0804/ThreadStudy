package com.kboss.threadstudy.p4.p251;

import java.util.*;

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);
        threadA.start();
        threadB.start();

        HashMap
    }
}
