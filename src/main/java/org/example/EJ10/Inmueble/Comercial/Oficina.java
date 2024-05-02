package org.example.EJ10.Inmueble.Comercial;

public class Oficina extends Comercial{

    public Oficina(int identificador, double areaM2, String direccion) {
        super(identificador, areaM2, direccion);

        this.valorM2 = 2400000;
    }

    @Override
    public void Imprimir() {
        super.Imprimir();

    }
}
