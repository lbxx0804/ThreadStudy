package com.kboss.threadstudy.p5.p242;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run1 {
    private static Timer timer = new Timer();

    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了！时间为" + new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask task = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2019-02-15 16:30:30";
            Date date = sdf.parse(dateString);
            System.out.println("字符串时间：" + date.toLocaleString()
                    + " 当前时间：" + new Date().toLocaleString());
            timer.schedule(task, date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
