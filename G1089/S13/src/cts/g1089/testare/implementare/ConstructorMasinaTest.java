package cts.g1089.testare.implementare;


import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorMasinaTest {
    @Test
    public void test1(){
        Masina masinaTest=new Masina("Volksvagen",30);
        assertEquals("Volksvagen",masinaTest.getModel());
        assertEquals(30,masinaTest.getCapacitateMaximaRezervor(),0.01);
        assertEquals(5,masinaTest.getConsumMediu(),0.01);
        assertEquals(0,masinaTest.getKilometraj());
        assertEquals((30/2),masinaTest.getNivelRezervor(),0.01);

    }

    @Test
    public void test2(){
        try {
            Masina masinaTest=new Masina("A3",30);
            //Nu
            fail("Test 2: Constructor implementat gresit: Nu arunca nicio exceptie pe input model gresit.");
        } catch (ExceptieModel e) {
            //Da
            assertTrue(true);
        }catch (ExceptieRezervor e){
            //Nu
            fail("S-a aruncat alta exceptie decat cea cautata");
        }
    }


    //Verificare daca obiectul a fost creat
    @Test
    public void test3(){
        Masina masinaTest=null;
        try {
            masinaTest=new Masina("Vo",30);
            fail("Test 3: Constructor implementat gresit: Nu arunca nicio exceptie pe input model gresit.");
        } catch (ExceptieModel e) {
            assertNull(masinaTest);
        }
    }
}