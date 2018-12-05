package com.kboss.threadstudy.p066;

public class Main {
    public int i = 10;

    synchronized public void operateIMainMethod() {
        i--;
        System.out.println("main print i = " + i);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
