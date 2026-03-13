package cts.curs.c03.Singleton.Serializare.v1;

import java.io.Serializable;

public class Singleton implements Serializable {

    private static Singleton instance;

    //SingletonData
    private String state = "stare 0";

    private Singleton() {

    }

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    //Singleton Methods+Operations on SingletonData
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state=state;
    }
}
