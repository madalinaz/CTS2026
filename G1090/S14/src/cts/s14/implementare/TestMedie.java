package cts.s14.implementare;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestMedie {
    @Test
    public void testRight() throws ExceptieNume, ExceptieNota, ExceptieMedie {
        Student student = new Student("Gigel");
        student.adaugaNota(10);
        student.adaugaNota(5);
        student.adaugaNota(3);
        student.adaugaNota(7);
        student.adaugaNota(9);
        student.adaugaNota(9);
        assertEquals(9.5,student.getBest2NoteDistincte(),0.01);
    }

    //Cardinality 0 (pentru lista alocata, doar goala)
    //Existance (lista note null) (x)
    //Reference (lista note null)
    //Exception (lista note null) (x)

    @Test(expected = ExceptieMedie.class)
    public void testExistance() throws ExceptieNume, ExceptieMedie {
        Student student = new Student("Gigel");
        student.getBest2NoteDistincte();
    }

    @Test(expected = ExceptieMedie.class)
    public void testCardinality0(){
        //student fara note, dar lista alocata
    }

    @Test(expected = ExceptieMedie.class)
    public void testCardinality1(){
        //student cu 1 nota
    }

    @Test
    public void testCardinalityN(){
        //student cu mai multe note (deja avem testarea right)
    }

    @Test
    public void testCardinality2(){
        //student cu mai multe note (deja avem testarea right)
    }


}