package cts.junit.c14.testare;

import cts.junit.c14.exceptii.ExceptieIBAN;
import cts.junit.c14.implementare.ContBancar;
import org.junit.Test;

public class ContBancarTest {

    @Test(expected = ExceptieIBAN.class)
    public void testException() throws ExceptieIBAN {
        ContBancar contBancar = new ContBancar("123");

    }

    @Test(timeout = 1000)
    public void testPerformance() throws ExceptieIBAN {
        ContBancar contBancar =
                new ContBancar("123");
        //contBancar.alimentareSold(100);
    }

    @Test
    public void testGol(){

    }

}