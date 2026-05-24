package cts.g1089.testare.implementare;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlimentareMasinaTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void alimentareTest(){
        Masina masinaTest=new Masina("Audi A3",75);
        try {
            masinaTest.alimenteazaRezervor(30);
        } catch (ExceptieAlimentare e) {
            fail();
        }
        assertEquals(67.5,masinaTest.getNivelRezervor(),00.1);
    }

    @Test
    public void alimentareTest2(){
        Masina masinaTest=new Masina("Audi",80);
        try {
            masinaTest.alimenteazaRezervor(40);
        } catch (ExceptieAlimentare e) {
            fail();
        }
        assertEquals(masinaTest.getCapacitateMaximaRezervor(),masinaTest.getNivelRezervor(),00.1);
    }

    @Test
    public void alimentareTest3(){
        Masina masinaTest=new Masina("Audi",80);
        try {
            masinaTest.alimenteazaRezervor(60);
            fail("Test 3: Nu a aruncat exceptie cand s-a depasit capacitatea rezervorului.");
        } catch (ExceptieAlimentare e) {
            assertTrue(true);
        }
    }

    @Test(expected = ExceptieAlimentare.class)
    public void alimentareTest4() throws ExceptieAlimentare {
        Masina masinaTest=new Masina("Audi",80);
        masinaTest.alimenteazaRezervor(100);
        fail("Test 4: Nu a aruncat exceptie cand s-a depasit capacitatea rezervorului.");
    }
}