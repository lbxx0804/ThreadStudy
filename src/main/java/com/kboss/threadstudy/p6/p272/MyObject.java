package com.kboss.threadstudy.p6.p272;


public class MyObject {

    private static class MyObjectHandler {
        private static MyObject myObject = new MyObject();
    }

    private MyObject() {
        System.out.println("初始化");
    }

    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }

}
