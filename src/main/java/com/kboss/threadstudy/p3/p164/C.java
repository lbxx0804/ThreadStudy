package com.kboss.threadstudy.p3.p164;

public class C {
    private String lock;

    public C(String lock) {
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                while (ValueObject.value.equals("")) {
                    System.out.println("消费者"
                            + Thread.currentThread().getName()
                            + "WAITTING了");
                    lock.wait();
                }
                System.out.println("消费者" +
                        Thread.currentThread().getName()
                        + "开始 RUNNABLE了");
                System.out.println("获取到值：" + ValueObject.value);
                ValueObject.value = "";
                lock.notifyAll();
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}
