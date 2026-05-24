import org.junit.Test;

import static org.junit.Assert.*;

public class MasinaCCTest {
    @Test
    public void test1() throws ExceptieCapacitateCilindrica {
        // testare "right" -> vad cum se comporta metoda atunci cand input-ul este bun\
        // recomandarea este sa nu incepem cu exceptiile
        Masina masina = new Masina("Dacia", 2500, "Romania");
        assertEquals("Dacia", masina.getModel());
        assertEquals("Nu s-a setat corect cc in ct pe input bun",2500, masina.getCc());
        assertEquals("Romania", masina.getTaraOrigine());
    }

    @Test
    public void test2() {
        Masina masina = null;
        try {
            masina = new Masina("Dacia", 200, "Romania");
            fail();
        } catch (ExceptieCapacitateCilindrica e) {
            assertTrue(true);
        }
    }

    @Test
    public void test3() {
        Masina masina = null;
        try {
            masina = new Masina("Dacia", 4500, "Romania");
            fail();
        } catch (ExceptieCapacitateCilindrica e) {
            assertTrue(true);
        }
    }

    @Test
    public void test4() {
        Masina masina = null;
        try {
            masina = new Masina("Dacia", 1000, "Romania");
            // DA + ma intereseaza ca si s-au initializat campurile cum trebuie, ca mi s-a creat obj
            assertEquals("Dacia", masina.getModel());
            assertEquals(1000, masina.getCc());
            assertEquals("Romania", masina.getTaraOrigine());
        } catch (ExceptieCapacitateCilindrica e) {
            // NU
            fail("Arunca exceptie pe input cc prag minim");
        }
    }

    @Test
    public void test5() {
        Masina masina = null;
        try {
            masina = new Masina("Dacia", 4000, "Romania");
            // NU
            fail("Nu arunca exceptie pe input cc prag maxim");
        } catch (ExceptieCapacitateCilindrica e) {
            // DA
            assertTrue(true);
        }
    }

    @Test
    public void test6() throws ExceptieCapacitateCilindrica {
        Masina masina = new Masina("Dacia", 3000, "Romania");
        assertTrue(masina!=null);

    }

    @Test
    public void test7() throws ExceptieCapacitateCilindrica {
        Masina masina = new Masina("Dacia", 3000, "Romania");
        assertNotNull(masina);

    }

}