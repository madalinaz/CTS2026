package cts.curs.c02.SOLID.D.After;

public class SuperWorker implements IWorker {

    String name;

    public SuperWorker(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println(name + " is super working!");
    }
}
