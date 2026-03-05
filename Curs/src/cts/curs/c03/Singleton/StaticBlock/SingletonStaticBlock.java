package cts.curs.c03.Singleton.StaticBlock;

public class SingletonStaticBlock {
    private static SingletonStaticBlock instance;

    private SingletonStaticBlock() {

    }

    static {
        instance=new SingletonStaticBlock();
    }

    public static SingletonStaticBlock getInstance() {
        return instance;
    }
}
