package com.kboss.threadstudy.p5.p252;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {
    static int count = 0;

    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("正常执行：" + count);
        }
    }

    public static void main(String[] args) {
        Date dtNow = new Date();
        while (true) {
            count++;
            MyTask myTask = new MyTask();
            Timer timer = new Timer();
            timer.schedule(myTask, dtNow);
            timer.cancel();
        }

    }
}
