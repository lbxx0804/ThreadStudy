package com.kboss.threadstudy.p6.p269;


public class MyObject {
    private MyObject() {

    }

    private static MyObject myObject;

    public static MyObject getInstance() {
        try {
            if (myObject == null) {
                Thread.sleep(1000);
                synchronized (MyObject.class) {
                    myObject = new MyObject();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
