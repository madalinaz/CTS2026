package cts.curs.c03.Singleton.StaticBlock;

public class SingletonStaticBlock {
    private static SingletonStaticBlock instance;

    private SingletonStaticBlock() {
        //work upon singleton data
    }

    static {
        instance=new SingletonStaticBlock();
    }

    public static SingletonStaticBlock getInstance() {
        return instance;
    }
}
