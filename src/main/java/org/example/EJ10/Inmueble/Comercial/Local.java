package org.example.EJ10.Inmueble.Comercial;

public class Local extends Comercial{
    protected String centroComercial;
    public Local(int identificador, double areaM2, String direccion, String centroComercial) {
        super(identificador, areaM2, direccion);
        this.centroComercial = centroComercial;
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
        System.out.println("Centro comercial: "+centroComercial);
    }
}
