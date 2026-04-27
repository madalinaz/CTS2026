package cts.g1094.chain.program;

import cts.g1094.chain.implementare.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IItem> itemi = new ArrayList<>();
        for(int i = 0;i<5;i++){
            itemi.add(new Imagine(i+100, i+200));
        }
        for(int i = 0;i<5;i++){
            itemi.add(new Paragraf("Text" + i, "rosu", true));
        }

        PaginaWeb paginaWeb = new PaginaWeb(itemi, "https://www.example.com");

        // definire responsabili
        IHandler h1 = new FiltrareImagini();
        IHandler h2 = new FiltrareCuloareParagraf();
        IHandler h3 = new FiltrareSetariParagraf();

        //creeare lant responsabili
        h1.setNextHandler(h2);
        h2.setNextHandler(h3);

        //trimitere cerere catre lant
        System.out.println(paginaWeb);
        h1.filtrare(paginaWeb);

        System.out.println("Dupa filtrari");
        System.out.println(paginaWeb);
    }
}