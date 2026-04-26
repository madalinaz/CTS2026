package chain_of_responsability.implementare;

public class HandlerNivelSalariu extends AHandler {
    @Override
    public boolean procesareCerere(Persoana p, float credit, int nrLuni) {

        float procentIndatorare = 0.4f - p.getNrCopii() * 0.05f;

        if (procentIndatorare < 0.25f) {
            procentIndatorare = 0.25f;
        }

        if (p.getSalariu() * procentIndatorare < credit / nrLuni) {
            System.out.println(p.getNume() + " respins din cauza salariului");
            return false;
        }
        if (this.getNextHandler() != null) {
            return this.getNextHandler().procesareCerere(p, credit, nrLuni);
        }
        return true;
    }
}





