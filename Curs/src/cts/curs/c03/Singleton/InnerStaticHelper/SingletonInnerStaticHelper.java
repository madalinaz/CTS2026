package cts.curs.c03.Singleton.InnerStaticHelper;

public class SingletonInnerStaticHelper {
    //SingletonData

    //constructor privat pentru a interzice instantierea
    private SingletonInnerStaticHelper() {
    }

    //static inner class -> stocheaza instanta unica
    //clasa nu este incarcata atunci cand clasa Singleton este incarcata
    private static class SingletonHelper {
        private static final SingletonInnerStaticHelper instance =
                new SingletonInnerStaticHelper();
    }

    //punctul global public de acces la instanta unica
    public static SingletonInnerStaticHelper getInstance() {
        return SingletonHelper.instance;
    }
}
