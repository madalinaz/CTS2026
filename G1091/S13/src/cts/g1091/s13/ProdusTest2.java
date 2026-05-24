package cts.g1091.s13;

import org.junit.Test;

import static org.junit.Assert.*;
public class ProdusTest2 {
    @Test
    public void test1(){
        Produs p = new Produs("banana");
        assertEquals("banana", p.getDenumire());
        assertEquals("Cantitatea nu e 0 pe nume conform", 0, p.getCantitate());
        assertNull(p.getListaPreturi());
    }

    @Test
    public void test2(){
        try {
            Produs p = new Produs("a");
            //NU
            fail("Nu a aruncat exceptie cand am dat denumire gresita.");
        } catch (ExceptieDenumire e) {
         //DA
            assertTrue(true);
        }
        catch(Exception e){
            fail("A aruncat exceptie dar nu cea corecta.");
        }
        //DA , oricum ar fi ajung pe linia aceasta
    }

    @Test
    public void test3(){
        try {
            Produs p = new Produs("ba");
            //DA
            assertEquals("ba", p.getDenumire());
            assertEquals("Cantitatea nu e 0 pe nume conform", 0, p.getCantitate());
            assertNull(p.getListaPreturi());
        } catch (Exception e) {
            //NU
            fail("Arunca exceptia cand nu trebuia pe lungime denumire minima");
        }
    }

    @Test
    public void test4(){
        String denumire = "a".repeat(99);
        try {
            Produs p = new Produs(denumire);
            //DA
            assertEquals(denumire, p.getDenumire());
            assertEquals("Cantitatea nu e 0 pe nume conform", 0, p.getCantitate());
            assertNull(p.getListaPreturi());
        } catch (Exception e) {
            //NU
            fail("Arunca exceptia cand nu trebuia pe lungime denumire minima");
        }
    }

}