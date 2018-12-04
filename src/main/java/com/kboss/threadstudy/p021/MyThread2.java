package com.kboss.threadstudy.p021;

public class MyThread2 extends Thread {
    @Override
    public void run(){
        try {
            
            System.out.println("run threadName="+this.currentThread().getName() + "   begin");
            Thread.sleep(2000);
            System.out.println("run threadName="+this.currentThread().getName()+"  end");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
