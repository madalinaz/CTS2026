package cts.g1092.factory.implementare;

// VERSIUNE SIMPLE FACTORY
// nu exista cls abstract la baza, nu avem abstractizare(interfata/ cls abstracta) in comparatie cu FactoryMethod
public class BauturiFactory {
    // recomandata ca meth sa fie statica
    public static IBautura getBautura(ETipBautura tipBautura){
        switch (tipBautura){
            case CAFEA:
                return new Cafea();
            case CIOCOLATA_CALDA:
                return new CiocolataCalda("-", "-");
        }
        return null;
    }
}
