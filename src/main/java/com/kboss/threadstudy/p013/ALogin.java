package com.kboss.threadstudy.p013;


public class ALogin extends Thread {

    @Override
    public void run(){
        LoginServlet.doPost("a","aa");
    }
}
