package com.kboss.threadstudy.p5.p243;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {
    private static Timer timer = new Timer(true);//守护线程

    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("执行了：" + new Date().toLocaleString());
        }
    }

    public static void main(String[] args) throws Exception {
        MyTask myTask = new MyTask();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = "2019-02-15 17:23:30";
        Date date = sdf.parse(dateString);
        System.out.println("字符串时间：" + dateString + "；当前时间：" + new Date().toString());
        timer.schedule(myTask, date);
        Thread.sleep(50000);
    }
}
