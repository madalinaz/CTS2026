package cts.curs.c03.Singleton.Enum;

public enum SingletonEnum {
    INSTANCE;


    private String appName = "MyApp";

    public String getAppName() {
        return appName;
    }

    public void setAppName(String name) {
        this.appName = name;
    }
}
