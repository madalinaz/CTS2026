package cts.curs.c02.SOLID.D.Before;

public class Manager {
    Worker worker;

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public void manage() {
        worker.work();
    }
}
