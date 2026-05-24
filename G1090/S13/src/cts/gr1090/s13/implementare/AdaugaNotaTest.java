package cts.gr1090.s13.implementare;

import org.junit.Test;
import java.util.List;


import static org.junit.Assert.*;
public class AdaugaNotaTest {

    @Test
    public void test1(){
        Student studentTest = new Student("Oana");
        try {
            //da
            studentTest.adaugaNota(6);
            List<Integer> nota6 = List.of(6);
            assertEquals(nota6, studentTest.getNote());
        } catch (ExceptieNota e) {
            //nu
            fail("Arunca exceptie chiar daca nota este buna");
        }
    }

    @Test
    public void test2() throws ExceptieNota {
        Student studentTest = new Student("Bianca");
        studentTest.adaugaNota(7);
        studentTest.adaugaNota(8);
        List<Integer> finalNote = List.of(7,8);
        assertEquals(finalNote, studentTest.getNote());
    }

    @Test
    public void test3(){
        Student studentTest = new Student("Bianca");
        try {
            studentTest.adaugaNota(15);
            //nu
            fail();
        } catch (ExceptieNota e) {
            //da
        }
    }

    @Test(expected = ExceptieNota.class)
    public void test4() throws ExceptieNota {
        Student student = new Student("Bianca");
        student.adaugaNota(15);
    }

  
}