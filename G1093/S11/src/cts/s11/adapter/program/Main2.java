package cts.s11.adapter.program;

import cts.s11.adapter.implementare.Adaptor;
import cts.s11.adapter.implementare.IMicroUSBIncarcator;
import cts.s11.adapter.implementare.MicroUSB;
import cts.s11.adapter.implementare.Telefon;

public class Main2 {
    public static void main(String[] args) {
        Telefon telefon = new Telefon("Huawei p20",60);
        IMicroUSBIncarcator incarcatorVechi = new MicroUSB();
        telefon.chargeUSBc(new Adaptor(incarcatorVechi));//adaptorul trb sa arate ca nevoia noastra USB C si sa faca trecerea spre MicroUSB(ceea ce dispunem)
    }
}
