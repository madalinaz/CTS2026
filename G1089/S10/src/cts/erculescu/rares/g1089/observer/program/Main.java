package cts.erculescu.rares.g1089.observer.program;

import cts.erculescu.rares.g1089.observer.implementare.Client;
import cts.erculescu.rares.g1089.observer.implementare.IObserver;
import cts.erculescu.rares.g1089.observer.implementare.ServiciuMeteo;
import cts.erculescu.rares.g1089.observer.implementare.ServiciuPolitiaRomana;

//Posesorii de telefoane mobile au posibilitatea de a se abona la serviciul de notificare pentru
//fiecare aplicatie instalata
//Se doreste o implementare care permite adaugarea de servicii pentru fiecare tip de aplicatie
//Serviciul se limiteaza la trimitere mesaj
public class Main {
    public static void main(String[] args) {
        IObserver client1=new Client("Rares");
        IObserver client2=new Client("Ana");
        IObserver client3=new Client("Anca");
        IObserver client4=new Client("Mihai");

        ServiciuMeteo accuWeatherBuc=new ServiciuMeteo("Serviciu Meteo Bucuresti","Bucuresti");
        ServiciuMeteo accuWeatherBrasov=new ServiciuMeteo("Serviciu Meteo Brasov","Brasov");
        ServiciuMeteo accuWeatherTargoviste=new ServiciuMeteo("Serviciu Meteo Targoviste","Targoviste");

        accuWeatherBuc.abonareObserver(client1);
        accuWeatherBrasov.abonareObserver(client1);
        accuWeatherTargoviste.abonareObserver(client2);

        accuWeatherBuc.setTemperatura(23.5);
        accuWeatherBrasov.setTemperatura(18.7);

        accuWeatherTargoviste.setTemperatura(24.0);

        accuWeatherBuc.setTemperatura(23.5);

        ServiciuPolitiaRomana serviciuPolitiaRomana=new ServiciuPolitiaRomana("Politia Romana");
        serviciuPolitiaRomana.abonareObserver(client2);
        serviciuPolitiaRomana.addAlerta("Copil Pierdut!",5);
        serviciuPolitiaRomana.addAlerta("Tamponare usoara pe Bd. Iuliu Maniu",1);
    }
}
