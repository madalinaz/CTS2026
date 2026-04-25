package composite.implementare;

import java.util.ArrayList;
import java.util.List;

public class NodStructura implements INod{
    private String denumire;
    //private boolean esteFragil; il gestionam in getter
    //private float greutate;
    private float greutateProprie;

    private List<INod> listaFii;

    public NodStructura(String denumire, float greutateProprie) {
        this.denumire = denumire;
        this.greutateProprie = greutateProprie;
        this.listaFii = new ArrayList<>();
    }

    @Override
    public boolean getEsteFragil() {

        for(INod nod:listaFii){
            if(nod.getEsteFragil()){
                return true;
            }
        }
        return false;
    }

    @Override
    public float getGreutate() {
        float total=greutateProprie;
        for(INod nod:listaFii){
            total+=nod.getGreutate();
        }
        return total;
    }

    @Override
    public void add(INod node) {
        if(node!=null){
            listaFii.add(node);
        }
    }

    @Override
    public void remove(INod node) {
        if(node!=null&&listaFii.contains(node)){
            listaFii.remove(node);
            System.out.println("a fost eliminat din lista nodul "+node.toString());
        }else{
            System.out.println("nu este in lista");
        }
    }

    @Override
    public INod getNod(int index) {
        if(0<index&&index<listaFii.size()){
            return listaFii.get(index);
        }
        return null;
    }
}
