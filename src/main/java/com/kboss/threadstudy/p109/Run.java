package com.kboss.threadstudy.p109;

import com.kboss.threadstudy.p109.PublicClass.PrivateClass;

public class Run {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("usernameValue");
        publicClass.setPassword("passwordValue");
        System.out.println(publicClass.getUsername() + "  "
                + publicClass.getPassword());
        PrivateClass privateClass = publicClass.new PrivateClass();
        privateClass.setAge("ageValue");
        privateClass.setAddress("addressValue");
        System.out.println(privateClass.getAge() + "  "
                + privateClass.getAddress());
    }
}
