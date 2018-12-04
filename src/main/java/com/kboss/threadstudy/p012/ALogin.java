package com.kboss.threadstudy.p012;

public class ALogin extends Thread {

    @Override
    public void run(){
        LoginServlet.doPost("a","aa");
    }
}
