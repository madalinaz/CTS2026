package cts.g1089.s05.ex1.Program;

import cts.g1089.s05.ex1.Implementare.API.APIDimensiuni;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        APIDimensiuni apiDimensiuni = APIDimensiuni.getInstance();
        apiDimensiuni.init();

        //utilizare API pentru a prelua standarde dimensiuni in functie de marimea dorita
        List<Integer> dimensiuni = apiDimensiuni.getDimensiuni(40);
        System.out.println(dimensiuni);
    }
}