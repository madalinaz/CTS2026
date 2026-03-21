package cts.g1092.s05.prototype1.program;

import cts.g1092.s05.prototype1.implementare.Crocs;

public class Main {
    public static void main(String[] args){
        Crocs crocs=new Crocs(30);
        System.out.println(crocs);
        Crocs crocs1= (Crocs) crocs.clonare();
        System.out.println(crocs1);
    }
}
