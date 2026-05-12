package cts.s12.g1093.flyweight.implementare;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlyweightFactory {
    private List<IFlyweight> colectie=new ArrayList<>();

    public FlyweightFactory() {
        initColectie();
    }

    public void initColectie(){
        colectie.add(new Vrajitor("Vrajitor cu aripi", List.of(1,2)));
        colectie.add(new Vrajitor("Vrajitor cu tepi", List.of(3,2)));
        colectie.add(new Monstru(List.of(1,2), 10, "negru"));
        colectie.add(new Monstru(List.of(2,2), 10, "rosu"));
        colectie.add(new Monstru(List.of(5,2), 20, "rosu"));
    }

    //returneaza un pers random din lista
    public IFlyweight getPersonaj(){
        Random rand=new Random();
        return colectie.get(rand.nextInt(colectie.size()));
    }
}
