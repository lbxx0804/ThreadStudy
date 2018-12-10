package com.kboss.threadstudy.p097;

public class StaticObject {

    synchronized public static void test1() {
        System.out.println("test1 进入：" + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test1 离开：" + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
    }

    synchronized public void test2() {
        System.out.println("test2 进入：" + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
        /*try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println("test2 离开：" + Thread.currentThread().getName() + "  " + System.currentTimeMillis());

    }

}
