package com.example.abstractclasses;

public class MysqlDatabaseManager extends BaseDatabaseManager{

    @Override
    public void getData() {
        System.out.println("Data brought : My Sql Server");
    }
}
