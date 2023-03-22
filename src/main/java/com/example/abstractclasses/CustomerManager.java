package com.example.abstractclasses;

import com.example.abstractclasses.BaseDatabaseManager;

public class CustomerManager {

    BaseDatabaseManager databaseManager;

    public void getCustomers (){
        databaseManager.getData();


    }
}
