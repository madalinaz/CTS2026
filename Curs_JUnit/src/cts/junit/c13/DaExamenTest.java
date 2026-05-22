package cts.junit.c13;

import org.junit.*;

import static org.junit.Assert.*;

//un test case
public class DaExamenTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("SetUp");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("TearDown");
    }

    @org.junit.BeforeClass
    public static void ex()  {
        System.out.println("SetUpBeforeClass");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("TearDownAfterClass");
    }

    @Test
    public void test1()  {
        System.out.println("Test 1");
    }

    @Test
    public void test2()  {
        assertEquals(1,2);
    }
}