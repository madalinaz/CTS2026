package composite.implementare;

import java.util.ArrayList;
import java.util.List;

public class NodStructura implements INod {

    private float greutateProprie;
    private String denumireStructura;
    private List<INod> listaFii;

    public NodStructura(float greutateProprie, String denumireStructura) {
        this.greutateProprie = greutateProprie;
        this.denumireStructura = denumireStructura;
        this.listaFii = new ArrayList<>();
    }

    @Override
    public boolean calculFragil() {
        for(INod fiu:listaFii){
            if(fiu.calculFragil()){
                return true;
            }
        }
        return false;
    }

    @Override
    public float calculGreutateTotala() {
        float greutateTotala = this.greutateProprie;
        for(INod fiu:this.listaFii){
            greutateTotala+=fiu.calculGreutateTotala();
        }
        return greutateTotala;
    }

    @Override
    public void adaugaNod(INod nod) {
        if(nod!=null)
        {
            this.listaFii.add(nod);
        }
    }

    @Override
    public void stergeNod(INod nod) {
        if(nod!=null)
        {
            this.listaFii.remove(nod);
        }

    }

    @Override
    public INod getNod(int index) {
        if(index>=0 && index<this.listaFii.size())
        {
            return this.listaFii.get(index);
        }
        return null;
    }
}
