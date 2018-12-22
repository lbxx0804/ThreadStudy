package com.kboss.threadstudy.p155;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");
        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);
        ThreadSubtract threadSubtract = new ThreadSubtract(subtract);
        threadSubtract.setName("subtract1Thread");
        threadSubtract.start();
        ThreadSubtract threadSubtract1 = new ThreadSubtract(subtract);
        threadSubtract1.setName("subtract2Thread");
        threadSubtract1.start();
        Thread.sleep(1000);
        ThreadAdd threadAdd = new ThreadAdd(add);
        threadAdd.setName("addThread");
        threadAdd.start();
    }
}
