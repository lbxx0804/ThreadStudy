package com.kboss.threadstudy.p086;

public class Service {
    private String anyString = new String();

    public void a() {
        //synchronized (this){ //使用this，则会阻塞该对象其他synchronized同步方法
        synchronized (anyString) {//不会阻塞该对象的其他synchronized同步方法，提高效率
            System.out.println("a beigin" + System.currentTimeMillis());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("a end" + System.currentTimeMillis());
        }
    }

    synchronized public void b() {
        System.out.println("b begin" + System.currentTimeMillis());
        System.out.println("b end");
    }
}
