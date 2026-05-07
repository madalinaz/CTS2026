package cts.curs.c11.Command_telecomanda.implementare;

public class Jaluzele {
    private String camera;

    public Jaluzele(String camera) {
        this.camera = camera;
    }

    void ridica(){
        System.out.println("S-au ridicat jaluzele in camera "+camera);
    }

    void coboara(){
        System.out.println("S-au coborat jaluzele in camera "+camera);
    }
}
