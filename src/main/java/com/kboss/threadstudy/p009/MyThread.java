package com.kboss.threadstudy.p009;

public class MyThread extends Thread {
    private int count = 5;

    public MyThread(String name){
        super();
        this.setName(name);//设置线程名称
    }

    @Override
    public void run(){
        super.run();
        while (count >0){
            count--;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程："+this.currentThread().getName()+"计算："+count);

        }
    }
}
