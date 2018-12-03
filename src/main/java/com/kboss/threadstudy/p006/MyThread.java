package com.kboss.threadstudy.p006;

public class MyThread extends Thread implements Runnable {
    @Override
    public void run(){
        super.run();
        try{
            for(int i =0;i<10;i++){
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("run="+Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
