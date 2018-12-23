package com.kboss.threadstudy.p177;

public class ThreadBackupA extends Thread {
    private DBTools dbTools;

    public ThreadBackupA(DBTools dbTools) {
        super();
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }
}
