package com.kboss.threadstudy.p076;

public class Task {
    private String getData1;
    private String getData2;

    public void doLongTimeTask() {
        System.out.println("begin task");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String privateData1 = "长时间处理任务后从远程返回的值1 threadName="
                + Thread.currentThread().getName();
        String privateData2 = "长时间处理任务后从远程返回的值2 threadName="
                + Thread.currentThread().getName();
        synchronized (this) {
            getData1 = privateData1;
            getData2 = privateData2;
            System.out.println(getData1);
            System.out.println(getData2);
        }

    }
}
