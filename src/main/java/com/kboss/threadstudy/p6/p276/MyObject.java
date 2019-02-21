package com.kboss.threadstudy.p6.p276;

import java.sql.Connection;

public enum MyObject {
    connectionFactory;
    private Connection connection;

    private MyObject() {

    }

    public Connection getConnection() {
        return connection;
    }
}
