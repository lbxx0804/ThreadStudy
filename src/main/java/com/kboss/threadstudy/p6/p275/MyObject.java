package com.kboss.threadstudy.p6.p275;

public class MyObject {
    private MyObject() {

    }

    private static MyObject myObject = null;

    static {
        myObject = new MyObject();
    }

    public static MyObject getInstance() {
        return myObject;
    }
}
