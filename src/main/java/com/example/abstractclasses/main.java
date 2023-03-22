package com.example.abstractclasses;

import com.example.abstractclasses.CustomerManager;

public class main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();

        customerManager.databaseManager= new MysqlDatabaseManager();
        customerManager.getCustomers();


        }
    }


