package com.kboss.threadstudy.p155;

public class Add {
    private String lock;

    public Add(String lock) {
        this.lock = lock;
    }

    public void add() {
        synchronized (lock) {
            ValueObject.list.add("anystring");
            lock.notifyAll();
        }
    }
}
