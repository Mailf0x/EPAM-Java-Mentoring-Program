package com.epam;

import java.util.List;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.sql.SQLException;

public class Runner {

    public static void main(String[] args) {
        List<Exception> list = new ArrayList<>();

        list.add(new ClassNotFoundException());
        list.add(new FileNotFoundException());
        list.add(new IOException());
        list.add(new RemoteException());
        list.add(new SQLException());
        for (Exception e : list) {
            try {
                throw e;
            } catch (Exception e) {
                System.out.println("It's exception");
            }
        }
    }
}
