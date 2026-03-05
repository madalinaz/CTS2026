package cts.curs.c02.SOLID.D.After;

public class Main {
    public static void main(String[] args) {
        // gestionand un Worker
        Worker worker = new Worker("Gigel");
        Manager manager = new Manager();
        manager.setWorker(worker);
        manager.manage();

        // gestionand un SuperWorker, nu sunt necesare modificari la nivel de Manager
        SuperWorker worker2 = new SuperWorker("Costel");
        manager.setWorker(worker2);
        manager.manage();
    }
}
