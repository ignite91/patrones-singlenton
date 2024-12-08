package org.example;

import org.example.database.Database;

public class Main {
    public static void main(String[] args) {
        var myDatabase1 = Database.getInstance("myDatabase1");
        System.out.println(myDatabase1.anyValue);
        var myDatabase2 = Database.getInstance("myDatabase2");
        System.out.println(myDatabase2.anyValue);
    }
}