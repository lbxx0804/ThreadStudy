package com.kboss.threadstudy.p177;

public class ThreadBackupB extends Thread {
    private DBTools dbTools;

    public ThreadBackupB(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}
