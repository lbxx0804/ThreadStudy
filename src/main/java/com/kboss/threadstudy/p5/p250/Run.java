package com.kboss.threadstudy.p5.p250;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {

    public static class MyTask1 extends TimerTask {
        @Override
        public void run() {
            System.out.println("A运行了，时间：" + new Date().toLocaleString());
            this.cancel();
        }
    }

    public static class MyTask2 extends TimerTask {
        @Override
        public void run() {
            System.out.println("B运行了，时间:" + new Date().toLocaleString());
        }
    }

    public static void main(String[] args) {
        MyTask1 myTask1 = new MyTask1();
        MyTask2 myTask2 = new MyTask2();
        Timer timer = new Timer();
        timer.schedule(myTask1, new Date(), 5000);
        timer.schedule(myTask2, new Date(), 5000);
    }
}
