package com.kboss.threadstudy.p053;

public class HasSelfPrivateNum {

    public void addI(String username) {
        try {
            int num = 0;
            if (username.equals("a")) {
                num = 100;
                System.out.println("a赋值完毕");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b赋值完毕");
            }
            System.out.println(username + "  num=" + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
