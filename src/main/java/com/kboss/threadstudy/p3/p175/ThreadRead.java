package com.kboss.threadstudy.p3.p175;

import java.io.PipedReader;

public class ThreadRead extends Thread {
    private ReadData readData;
    private PipedReader input;

    public ThreadRead(ReadData readData, PipedReader input) {
        this.readData = readData;
        this.input = input;
    }

    @Override
    public void run() {
        readData.readMethod(input);
    }
}
