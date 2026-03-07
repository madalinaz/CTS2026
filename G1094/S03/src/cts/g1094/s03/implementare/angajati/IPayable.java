package cts.g1094.s03.implementare.angajati;
//interfata are doar campuri statice
//avem metode public si max un camp static

// Diferenta intre double (primitiva) si Double (clasa Wrapper):
// 1. double: Mai rapida, ocupa mai putina memorie, nu poate fi NULL. Recomandat
// pentru calcule matematice.
// 2. Double: Este un obiect, permite valoarea NULL, poate fi folosit in
// colectii (ex: List<Double>), dar are overhead.

public interface IPayable {
    double calculSalariu();

    default String getCOR(){
        return null;
    }
}
