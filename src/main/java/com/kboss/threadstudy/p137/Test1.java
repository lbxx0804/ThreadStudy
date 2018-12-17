package com.kboss.threadstudy.p137;

public class Test1 {
    public static void main(String[] args) {
        try {
            String newString = new String("");
            newString.wait();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
