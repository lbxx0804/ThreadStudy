package com.kboss.threadstudy.p3.p158;

public class P {
    private String lock;

    public P(String lock) {
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                if (!ValueObject.value.equals("")) {
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set 的值是 " + value);
                ValueObject.value = value;
                lock.notify();
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
