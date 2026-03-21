package cts.g1091.s05.ex2.Implementare;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractJucator implements Cloneable{
    //campuri
    protected String nume;
    protected List<String> listaMedicamente;
    protected List<Exercitiu> antrenament;

    //constructor????

    @Override
    public AbstractJucator clone() throws CloneNotSupportedException {
        AbstractJucator copie = (AbstractJucator) super.clone();

        //aici doar ne ocupam de ce este deep
        //copie.antrenament = new ArrayList<>(this.antrenament);
        copie.antrenament = new ArrayList<>();
        for(Exercitiu exercitiu : this.antrenament){
            copie.antrenament.add(new Exercitiu(exercitiu.getDenumire(), exercitiu.getNrRepetitii()));
        }

        return copie;
    }

    //metode pentru a demonstra shallow si deep
    public void schimbaNrRepetitii(int nrExercitiu, int nrRepetitii) {
        this.antrenament.get(nrExercitiu).setNrRepetitii(nrRepetitii);
    }

    //metode abstracta care sa justifice existenta unei abstractizari

    @Override
    public String toString() {
        return "AbstractJucator{" +
                "nume='" + nume + '\'' +
                ", listaMedicamente=" + listaMedicamente +
                ", antrenament=" + antrenament +
                '}';
    }
}
