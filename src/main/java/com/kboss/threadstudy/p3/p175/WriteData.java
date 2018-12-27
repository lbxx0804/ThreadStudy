package com.kboss.threadstudy.p3.p175;

import java.io.IOException;
import java.io.PipedWriter;

public class WriteData {
    public void writeMethod(PipedWriter pipedWriter) {
        try {
            System.out.println("Write :");
            for (int i = 0; i < 300; i++) {
                String outData = "" + (i + 1);
                pipedWriter.write(outData);
                System.out.print(outData);
            }
            System.out.println();
            pipedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
