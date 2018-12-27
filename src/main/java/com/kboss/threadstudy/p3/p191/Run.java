package com.kboss.threadstudy.p3.p191;

public class Run {
    public static ThreadLocal tl = new ThreadLocal();

    public static void main(String[] args) {
        if (tl.get() == null) {
            System.out.println("从未放过之");
            tl.set("我的值");
        }
        System.out.println(tl.get());
        System.out.println(tl.get());
    }
}
