package com.kboss.threadstudy.p3.p172;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Run {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();
            PipedInputStream pipedInputStream = new PipedInputStream();
            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            pipedOutputStream.connect(pipedInputStream);
            ThreadRead threadRead = new ThreadRead(readData, pipedInputStream);
            threadRead.start();
            Thread.sleep(2000);
            ThreadWrite threadWrite = new ThreadWrite(writeData, pipedOutputStream);
            threadWrite.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
