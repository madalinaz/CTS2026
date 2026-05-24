import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UtilsTest {

    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("Apel setUp");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("Apel tearDown");
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        System.out.println("Apel BeforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception{
        System.out.println("Apel AfterClass");
    }


    @org.junit.Test
    public void maxPar() throws ExceptieValoarePara, ExceptieListaGoala {
        System.out.println("Apel test 1");
        // verificare meth care are cel putin doua val pare
        List<Integer> lista = List.of(23, 2, 12, 5, 3, 6);
        int rezultat = Utils.maxPar(lista);
        assertEquals("Verificare pe lista cu doua valori pare", 12, rezultat);
    }

    @Test
    public void maxPar2() {
        System.out.println("Apel test 2");
        List<Integer> lista = null;
        try {
            int rezultat = Utils.maxPar(lista);
            fail("Nu arunca nicio exceptie cand lista este nula"); // putem si assertTrue(false)
        } catch (ExceptieListaGoala e) {
            assertTrue("Arunca exceptie buna pe lista null",true);
        } catch (ExceptieValoarePara e) {
            assertTrue("Arunca exceptie gresita pe lista null",false);
        }
    }

    @Test
    public void maxPar3(){
        System.out.println("Apel test 3");
        List<Integer> lista = List.of(23, 5, 3, 9);
        try {
            int rezultat = Utils.maxPar(lista);
            fail("Nu arunca nicio exceptie cand lista nu are val pare"); // putem si assertTrue(false)
        } catch (ExceptieListaGoala e) {
            assertTrue("Arunca exceptie gresita pe lista fara val pare",false);
        } catch (ExceptieValoarePara e) {
            assertTrue(true);
        }
    }

}