package com.kboss.threadstudy.p107;

import com.kboss.threadstudy.p053.Run;

public class DeadThadTest implements Runnable {
    private Object object1 = new Object();
    private Object object2 = new Object();

    private String userName;

    public void setFlag(String userName) {
        this.userName = userName;
    }

    @Override
    public void run() {
        if (userName.equals("a")) {
            synchronized (object1) {
                try {
                    System.out.println("username=" + userName);
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                synchronized (object2) {
                    System.out.println("按lock1 -> lock2 代码顺序执行了");
                }
            }
        }
        if (userName.equals("b")) {
            synchronized (object2) {
                try {
                    System.out.println("username=" + userName);
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                synchronized (object1) {
                    System.out.println("按lock2 -> lock1代码顺序执行");
                }
            }
        }
    }
}
