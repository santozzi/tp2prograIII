package org.example.EJ10.Inmueble.Comercial;

import org.example.EJ10.Inmueble.Comercial.localizacion.Localizacion;
import org.example.EJ10.Inmueble.Inmueble;

public abstract class Comercial extends Inmueble {
    protected Localizacion localizacion;
    public Comercial(int identificador, double areaM2, String direccion) {
        super(identificador, areaM2, direccion);
    }

    @Override
    public void Imprimir() {

    }
}
