package com.kboss.threadstudy.p175;

import java.io.PipedReader;
import java.io.PipedWriter;

public class Run {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();
            PipedWriter pipedWriter = new PipedWriter();
            PipedReader pipedReader = new PipedReader();
            pipedWriter.connect(pipedReader);
            ThreadRead threadRead = new ThreadRead(readData, pipedReader);
            threadRead.start();
            Thread.sleep(2000);
            ThreadWrite threadWrite = new ThreadWrite(writeData, pipedWriter);
            threadWrite.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
