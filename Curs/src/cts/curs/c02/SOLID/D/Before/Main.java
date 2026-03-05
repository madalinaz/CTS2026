package cts.curs.c02.SOLID.D.Before;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Gigel");

        Manager manager = new Manager();
        manager.setWorker(worker);
        manager.manage();

        //SuperWorker worker2 = new SuperWorker("Costel");
    }
}
