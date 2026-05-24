package cts.g1091.s13;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProdusTest {
    @Test
    public void test1(){
        Produs p = new Produs("Banana");
        try {
            p.modificarePret(20);
            //DA

        } catch (ExceptieIstoric e) {
            fail("A aruncat exceptia istoric cand verifica pret pe lista goala");
        } catch (ExceptiePret e) {
           fail("A aruncat exceptie pret cand pretul era conform.");
        }
    }

    @Test
    public void test2(){
        Produs p = new Produs("Banana");
        try {
            p.modificarePret(20);
            p.modificarePret(20);
            fail("Nu arunca exceptie pe ultim pret.");
        } catch (ExceptieIstoric e) {
            //DA

        } catch (ExceptiePret e) {
            fail("Nu arunca exceptia potrivita.");
        }
    }

    @Test(expected = ExceptiePret.class)
    public void test3() throws Exception {
        Produs p = new Produs("lapte");
        p.modificarePret(-4);
    }

}