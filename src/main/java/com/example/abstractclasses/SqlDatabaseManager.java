package com.example.abstractclasses;

import com.example.abstractclasses.BaseDatabaseManager;

public class SqlDatabaseManager extends BaseDatabaseManager {

    public void getData(){
        System.out.println("Data brought : Sql Server");
    }


}
