package com.kboss.threadstudy.p066;

public class Sub extends Main {
    synchronized public void operateISubMethod() {
        while (i > 0) {
            i--;
            System.out.println("sub pring i = " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.operateIMainMethod();
        }
    }
}
