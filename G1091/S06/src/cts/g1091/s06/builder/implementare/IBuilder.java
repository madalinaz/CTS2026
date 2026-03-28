package cts.g1091.s06.builder.implementare;

public interface IBuilder {
    Pantof build();
    IBuilder setMaterialSecundar(String materialSecundar);
    IBuilder addMesaj(String mesaj);
}
