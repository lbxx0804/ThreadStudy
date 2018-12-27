package com.kboss.threadstudy.p3.p165;

public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        C c = new C(myStack);
        P p = new P(myStack);
        ThreadP threadP = new ThreadP(p);
        ThreadC threadC = new ThreadC(c);
        threadP.start();
        threadC.start();
    }
}
