package com.kboss.threadstudy.p160;

public class Run {
    public static void main(String[] args) throws Exception {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        ThreadP[] threadPS = new ThreadP[2];
        ThreadC[] threadCS = new ThreadC[2];
        for (int i = 0; i < 2; i++) {
            threadPS[i] = new ThreadP(p);
            threadPS[i].setName("生产者" + (i + 1));
            threadCS[i] = new ThreadC(c);
            threadCS[i].setName("消费者" + (i + 1));
            threadPS[i].start();
            threadCS[i].start();
        }
        Thread.sleep(5000);
        Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadArray);
        for (int i = 0; i < threadArray.length; i++) {
            System.out.println(threadArray[i].getName()
                    + " " + threadArray[i].getState());
        }
    }
}
