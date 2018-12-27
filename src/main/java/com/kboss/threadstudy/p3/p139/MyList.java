package com.kboss.threadstudy.p3.p139;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private static List list = new ArrayList();

    public static void add() {
        list.add("aaa");
    }

    public static int size() {
        return list.size();
    }
}
