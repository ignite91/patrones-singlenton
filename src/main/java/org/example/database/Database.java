package org.example.database;

public class Database {
    private static Database mySingletoneDatabase;
    public String anyValue;

    private Database(String anyValue){
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.anyValue = anyValue;
    }

    public static Database getInstance(String anyValue) {
        if (mySingletoneDatabase == null) {
            mySingletoneDatabase = new Database(anyValue);
        }
        return mySingletoneDatabase;
    }
}