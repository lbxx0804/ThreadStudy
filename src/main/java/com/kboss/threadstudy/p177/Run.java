package com.kboss.threadstudy.p177;

public class Run {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 20; i++) {
            ThreadBackupA backupA = new ThreadBackupA(dbTools);
            backupA.start();
            ThreadBackupB backupB = new ThreadBackupB(dbTools);
            backupB.start();
        }
    }
}
