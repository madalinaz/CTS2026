package cts.s14.implementare;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String nume;
    private List<Integer> note;
    private int anStudiu;

    public Student(String nume) throws ExceptieNume {
        if(nume.length()<3){
            throw new ExceptieNume();
        }
        else{
            this.nume = nume;
        }
        this.note = null;
        this.anStudiu = 1;

    }


    public String getNume() {
        return nume;
    }

    public List<Integer> getNote() {
        return note;
    }

    public int getAnStudiu() {
        return anStudiu;
    }

    public void adaugaNota(int nota) throws ExceptieNota {

        if(nota>=1 && nota<=10){
            if(this.note==null){
                this.note = new ArrayList<>();
            }
            this.note.add(nota);
        }
        else{
            throw new ExceptieNota();
        }
    }

    public double getBest2NoteDistincte() throws ExceptieMedie{
        //returneaza media celor mai bune 2 note de trecere distincte
        return 0.0;
    }
}
