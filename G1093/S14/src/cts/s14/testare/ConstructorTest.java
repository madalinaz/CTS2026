package cts.s14.testare;

import cts.s14.exceptii.ExceptieMedie;
import cts.s14.exceptii.ExceptieNume;
import cts.s14.implementare.Student;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorTest {
    @Test
    public void testRight() throws ExceptieNume, ExceptieMedie {
        Student s = new Student("Gigel",6.5);
        assertEquals("Meth nu trateaza corect un nume de lg buna","Gigel", s.getNume());
        assertEquals("Meth nu trateaza corect o medie buna", 6.5, s.getMedieAdmitere(),0.01);
    }

    @Test
    public void testException(){
        try {
            Student s = new Student("A",6.5);
       //1 nu
            fail("Nu a aruncat nicio exceptie pentru nume de lg prea mica");
        } catch (ExceptieNume e) {
            //2 da
            assertTrue(true);
        } catch (ExceptieMedie e) {
            //3 nu
            fail("Pentru nume de lg mica, arunca alta exceptie");
        }
    }

    @Test(expected = ExceptieNume.class)
    public void testException2() throws ExceptieNume, ExceptieMedie {
        Student s = new Student("A",6.5);
    }

    @Test(expected = ExceptieNume.class)
    public void testException3() throws ExceptieNume, ExceptieMedie {
        Student s = new Student(null,6.5);
    }

    @Test
    public void testBoundaryNumeLower() throws ExceptieNume, ExceptieMedie {
        Student s = new Student
                ("Ion",6.5);
        assertEquals("Meth nu trateaza corect un nume de lg minima","Ion", s.getNume());
        assertEquals("Meth nu trateaza corect setare medie pe nume de lg minima", 6.5, s.getMedieAdmitere(),0.01);
    }
}