package cts.curs.c02.SOLID.D.After;

public class Worker implements IWorker {
    String name;

    public Worker(String name) {
        this.name = name;
    }
    @Override
    public void work() {
        System.out.println(name + " is working.");
    }
}
