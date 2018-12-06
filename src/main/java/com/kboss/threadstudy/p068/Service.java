package com.kboss.threadstudy.p068;

public class Service {
    synchronized public void testMethod() {
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("ThreadName=" + Thread.currentThread().getName()
                    + " run beginTime=" + System.currentTimeMillis());
            int i = 1;
            while (i == 1) {
                String r = ("" + Math.random()).substring(0, 4);
                System.out.println(r);
                if (r.equals("0.12")) {
                    System.out.println("ThreadName=" + Thread.currentThread().getName()
                            + " run exceptionTime = "
                            + System.currentTimeMillis()
                    );
                    Integer.parseInt("a");
                }
            }
        } else {
            System.out.println("Thread B run Time =" + System.currentTimeMillis());
        }
    }
}