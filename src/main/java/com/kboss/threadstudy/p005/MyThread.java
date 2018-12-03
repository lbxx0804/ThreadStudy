package com.kboss.threadstudy.p005;

public class MyThread extends Thread implements Runnable {
    @Override
    public void run(){
        super.run();
        System.out.println("MyThread");
    }
}
