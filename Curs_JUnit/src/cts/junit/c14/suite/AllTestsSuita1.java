package cts.junit.c14.suite;

import cts.junit.c14.categories.B;
import cts.junit.c14.testare.AutostradaTestMock;
import cts.junit.c14.testare.AutostradaTestMock2;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//@RunWith(Suite.class)
@RunWith(Categories.class)
@Categories.IncludeCategory(B.class)
@Suite.SuiteClasses({
        AutostradaTestMock.class,
        AutostradaTestMock2.class
})

public class AllTestsSuita1 {
}
