package cts.curs.c02.SOLID.D.Before;

public class SuperWorker {
    String name;
    public void work(){
        System.out.println(name + " is super working!");
    }

    public SuperWorker(String name) {
        this.name = name;
    }
}
