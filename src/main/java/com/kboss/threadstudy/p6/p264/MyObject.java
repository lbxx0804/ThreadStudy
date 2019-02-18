package com.kboss.threadstudy.p6.p264;


public class MyObject {
    private MyObject() {

    }

    private static MyObject myObject;

    public static MyObject getInstance() {
        if (myObject == null) {
            myObject = new MyObject();
        }
        return myObject;
    }
}
