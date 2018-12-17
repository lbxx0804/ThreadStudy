package com.kboss.threadstudy.p137;

public class Test2 {
    public static void main(String[] args) {
        try {
            String lock = new String();
            System.out.println("syn上面");
            synchronized (lock) {
                System.out.println("syn第一行");
                lock.wait();
                System.out.println("wait 下的代码");
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
