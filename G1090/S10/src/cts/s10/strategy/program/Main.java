package cts.s10.strategy.program;


import cts.s10.strategy.implementare.Client;
import cts.s10.strategy.implementare.PlanDesign;
import cts.s10.strategy.implementare.Vizualizare3D;
import cts.s10.strategy.implementare.VizualizareProduse;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PlanDesign planDesign = new PlanDesign(1, "Dormitor Master", "dormitor", List.of("pat", "covor", "perdea"));

        Client client = new Client(List.of("Vizualizare2D()", Vizualizare3D.class.getSimpleName()));


        client.procesarePlanDesign(planDesign);

        client.setStrategieCurenta(new Vizualizare3D());
        client.procesarePlanDesign(planDesign);

        client.setStrategieCurenta(new VizualizareProduse());
        client.procesarePlanDesign(planDesign);

    }
}
