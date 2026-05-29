package cts.junit.c14.suite;


import cts.junit.c14.implementare.ContBancar;
import cts.junit.c14.testare.AutostradaTestMock;
import cts.junit.c14.testare.AutostradaTestMock2;
import cts.junit.c14.testare.ContBancarTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AutostradaTestMock2.class,
        AutostradaTestMock.class,
        ContBancarTest.class
})
public class Suita2 {
}
