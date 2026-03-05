package cts.curs.c02.SOLID.D.Before;

public class Worker {
    String name;
    public void work(){
        System.out.println(name + " is working!");
    }

    public Worker(String name) {
        this.name = name;
    }
}
