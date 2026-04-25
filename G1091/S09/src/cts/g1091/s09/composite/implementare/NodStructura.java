package cts.g1091.s09.composite.implementare;

import java.util.ArrayList;
import java.util.List;

public class NodStructura implements INod {

    private String denumire;
    private List<INod> listaCopii;

    public NodStructura(String denumire) {
        this.denumire = denumire;
        this.listaCopii = new ArrayList<>();
    }

    @Override
    public int getTotalNrCazuri() {
        int total = 0;
        for (INod n : listaCopii) {
            total += n.getTotalNrCazuri();
        }
        return total;
    }

    @Override
    public boolean getEsteTransmisibila() {
        for (INod n : listaCopii) {
            if (n.getEsteTransmisibila()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean esteSigura() {
        int count = 0;
        for (INod nod : listaCopii) {
            if (nod.getEsteTransmisibila()) {
                count++;
            }
        }
        if (this.getTotalNrCazuri() >= 1000 || count > 0) {
            return false;
        }
        return true;
    }

    @Override
    public void addNod(INod nod) {
        this.listaCopii.add(nod);
    }

    @Override
    public void removeNod(INod nod) {
        this.listaCopii.remove(nod);
    }

    @Override
    public INod getNode(int index) {
        return this.listaCopii.get(index);
    }
}
