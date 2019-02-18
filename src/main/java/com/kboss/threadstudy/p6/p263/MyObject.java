package com.kboss.threadstudy.p6.p263;

public class MyObject {

    private MyObject() {

    }

    private static MyObject myObject = new MyObject();

    public static MyObject getInstance() {
        return myObject;
    }
}
