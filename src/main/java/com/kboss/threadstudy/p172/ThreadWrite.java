package com.kboss.threadstudy.p172;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class ThreadWrite extends Thread {
    private WriteData writeData;
    private PipedOutputStream pipedOutputStream;

    public ThreadWrite(WriteData writeData, PipedOutputStream pipedOutputStream) {
        super();
        this.writeData = writeData;
        this.pipedOutputStream = pipedOutputStream;
    }

    @Override
    public void run() {
        writeData.writeMethod(pipedOutputStream);
    }
}
