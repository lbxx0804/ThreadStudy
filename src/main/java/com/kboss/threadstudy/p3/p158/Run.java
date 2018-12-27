package com.kboss.threadstudy.p3.p158;

public class Run {
    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        ThreadC threadC = new ThreadC(c);
        ThreadP threadP = new ThreadP(p);
        threadC.start();
        threadP.start();
    }
}
