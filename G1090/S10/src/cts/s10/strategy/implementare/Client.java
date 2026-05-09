package cts.s10.strategy.implementare;

import java.util.List;

public class Client {
    private IStrategy strategieCurenta;
    private List<String> listaStrategii;


    public Client(List<String> listaStrategii) {
        this.listaStrategii = listaStrategii;
    }

    public void setStrategieCurenta(IStrategy strategie){
        if(listaStrategii.contains(strategie.getClass().getSimpleName())){
            this.strategieCurenta = strategie;
        }
        else{
            System.out.println("Nu a platit clientul pentru aceast plan");
        }

    }



    public void procesarePlanDesign(PlanDesign planDesign){
        if(strategieCurenta!=null) {
            this.strategieCurenta.vizualizare(planDesign);
        }
        else{
            System.out.println("Nu avem o strategie selectata");
        }
    }

}
