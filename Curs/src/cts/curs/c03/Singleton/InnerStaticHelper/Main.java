package cts.curs.c03.Singleton.InnerStaticHelper;

public class Main {
    public static void main(String[] args) {
        SingletonInnerStaticHelper s1;
        SingletonInnerStaticHelper s2;

        s1=SingletonInnerStaticHelper.getInstance();
        s2=SingletonInnerStaticHelper.getInstance();

        if(s1==s2)
            System.out.println("Instante identice Inner static helper");
        else
            System.out.println("Instantele nu sunt identice");
    }
}
