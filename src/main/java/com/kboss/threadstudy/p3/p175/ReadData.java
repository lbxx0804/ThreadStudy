package com.kboss.threadstudy.p3.p175;

import java.io.IOException;
import java.io.PipedReader;

public class ReadData {
    public void readMethod(PipedReader pipedReader) {
        try {
            System.out.println("Read :");
            char[] byteArray = new char[20];
            int readLength = pipedReader.read(byteArray);
            while (readLength != -1) {
                String newData = new String(byteArray, 0, readLength);
                System.out.print(newData);
                readLength = pipedReader.read(byteArray);
            }
            System.out.println();
            pipedReader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
