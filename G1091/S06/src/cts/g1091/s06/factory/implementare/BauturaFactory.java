package cts.g1091.s06.factory.implementare;

public class BauturaFactory {

    public static Bautura getBautura(TipBautura tip,String nume, int volum, float pret){

        switch(tip){
            case CAFEA:
                return new Cafea(nume,volum,pret,false);
                case CEAI:
                    return new Ceai(nume,volum,pret);
                    default:
                        return null;
        }
    };
}
