package cts.curs.c03.Singleton.Enum;

public class Program {

    public static void main(String[] args) {
        SingletonEnum.INSTANCE.setAppName("TestApp");
        System.out.println(SingletonEnum.INSTANCE.getAppName());
    }
}
