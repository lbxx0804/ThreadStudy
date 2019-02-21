package com.kboss.threadstudy.p6.p273;

import java.io.*;

public class Run {
    public static void main(String[] args) {
        MyObject myObject = MyObject.getInstance();
        System.out.println(myObject.hashCode());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("myObject.txt"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(myObject);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(new File("myObject.txt"));
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            myObject = (MyObject) objectInputStream.readObject();
            System.out.println(myObject.hashCode());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
