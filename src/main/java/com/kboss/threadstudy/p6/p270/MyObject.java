package com.kboss.threadstudy.p6.p270;


public class MyObject {
    private MyObject() {

    }

    private static MyObject myObject;

    public static MyObject getInstance() {
        try {
            if (myObject != null) {
            } else {
                Thread.sleep(1000);
                synchronized (MyObject.class) {
                    if (myObject == null) {
                        myObject = new MyObject();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
