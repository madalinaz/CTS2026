package cts.s2.gr1091.implementare.angajati;

public interface IAngajat {
    // Diferenta intre double (primitiva) si Double (clasa Wrapper):
    // 1. double: Mai rapida, ocupa mai putina memorie, nu poate fi NULL. Recomandat
    // pentru calcule matematice.
    // 2. Double: Este un obiect, permite valoarea NULL, poate fi folosit in
    // colectii (ex: List<Double>), dar are overhead.
    double calculSalariu();

    String getNume();
}
