package com.kboss.threadstudy.p6.p273;

import com.sun.deploy.panel.ExceptionListDialog;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class MyObject implements Serializable {
    private static final long serialVersionUID = 999L;

    private static class MyObjectHandle {
        private static final MyObject myObject = new MyObject();
    }

    private MyObject() {

    }

    public static MyObject getInstance() {
        return MyObjectHandle.myObject;
    }

    private Object readResolve() throws ObjectStreamException {
        System.out.println("调用了readResolve方法");
        return MyObjectHandle.myObject;
    }
}
