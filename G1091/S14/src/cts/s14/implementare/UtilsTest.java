package cts.s14.implementare;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsTest {

    //conformance (x)
    //range
    @Test
    public void testConformace() throws Exception {
        //de verif ca return meth este intre min si max
        //plus de verif ca este para
        int r = Utils.getValoareParaRandom(10,200);
        assertTrue(r%2 == 0 && r>=10 && r<=200);
    }

    @Test(expected = Exception.class)
    public void testException() throws Exception {
        //verif cu capete inversate, deci nu e interval
        //deci arunca exceptie
        Utils.getValoareParaRandom(200,100);
    }

    @Test
    public void testBoundary() throws Exception {
        int r = Utils.getValoareParaRandom(4,4);
        assertEquals(4, r);
    }

    @Test(expected = Exception.class)
    public void testExistance() throws Exception {
        Utils.getValoareParaRandom(5,5);
    }

    @Test(timeout = 1000)
    public void testPerformance() throws Exception {
        Utils.getValoareParaRandom(10,210);
    }



}