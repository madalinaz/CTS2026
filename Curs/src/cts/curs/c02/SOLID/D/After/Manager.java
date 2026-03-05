package cts.curs.c02.SOLID.D.After;

public class Manager {
    IWorker worker;  // depends on abstraction, not concrete class

    public IWorker getWorker() {
        return worker;
    }

    public void setWorker(IWorker worker) {
        this.worker = worker;
    }

    public void manage() {
        worker.work();
    }
}
