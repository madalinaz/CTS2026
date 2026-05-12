package cts.flyweight.program;

import cts.flyweight.implementare.DiagnostigeFactory;
import cts.flyweight.implementare.Reteta;

public class Main {
    public static void main(String[] args) {
       Reteta reteta = new Reteta("Ion","paracetamol");
       DiagnostigeFactory.getRecomandare("APA").printare(reteta);

        //todo validare la get din Factory
        //alta implem de eager care sa nu contina mapa statica
        //o versiune de late init care sa incarce in mapa ori de cate ori se cere o noua reteta
        //o moddalitate de a cuantifica optimizarea de spatiu de memorie (cate obiecte stocate vs cate obiecte utilizate)
        //metoda get din Fcatory sa genereze un obiect random(aici in versiunea de eager init)
        //de implem si o versiune de flyweight cu o familie de clase concrete din Flyweight

    }
}