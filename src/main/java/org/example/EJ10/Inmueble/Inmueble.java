package org.example.EJ10.Inmueble;

public abstract class Inmueble {
    //debe tener 5 digitos
    protected int identificador;
    protected double areaM2;
    protected String direccion;
    protected double valorM2;

    public Inmueble(int identificador, double areaM2, String direccion) {
        this.identificador = identificador;
        this.areaM2 = areaM2;
        this.direccion = direccion;
    }

    public abstract void Imprimir();

}
