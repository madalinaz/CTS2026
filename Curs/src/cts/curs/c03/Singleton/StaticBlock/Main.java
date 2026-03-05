package cts.curs.c03.Singleton.StaticBlock;

public class Main {
    public static void main(String[] args) {
        SingletonStaticBlock s1;
        SingletonStaticBlock s2;
        s1=SingletonStaticBlock.getInstance();
        s2=SingletonStaticBlock.getInstance();
        if(s1==s2)
            System.out.println("Instante identice versiune static block");
        else
            System.out.println("Instantele nu sunt identice");
    }
}
