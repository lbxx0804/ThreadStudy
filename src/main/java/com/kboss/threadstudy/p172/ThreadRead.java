package com.kboss.threadstudy.p172;

import java.io.PipedInputStream;

public class ThreadRead extends Thread {
    private ReadData readData;

    private PipedInputStream inputStream;

    public ThreadRead(ReadData readData, PipedInputStream inputStream) {
        super();
        this.readData = readData;
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        readData.readMethod(inputStream);
    }
}
