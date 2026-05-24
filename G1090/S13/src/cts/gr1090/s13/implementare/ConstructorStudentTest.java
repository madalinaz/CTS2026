package cts.gr1090.s13.implementare;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorStudentTest {

    @Test
    public void test1(){
        //Testam constructorul pe imput care nu arunca exceptie
        Student studentTest = new Student("Claudiu");
        assertEquals("Claudiu", studentTest.getNume());
        //assertEquals(null, studentTest.getNote());
        assertNull(studentTest.getNote());
        assertEquals("An studiu nu e setat 1 pentru input nume corect",1, studentTest.getAnStudiu());

    }

    @Test
    public void test2(){
        try {
            Student studentTest = new Student("X");
            //nu
            fail("Meth nu arunca exceptie pentru nume gresit");

        } catch (ExceptieNume e) {
            //da
            assertTrue(true);
        }catch(Exception e){
            fail("Meth nu arunca exceptia corecta petru nume gresit");
        }
    }

}