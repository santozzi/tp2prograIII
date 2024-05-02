package org.example.EJ10.Inmueble.Vivienda.Casa;

import org.example.EJ10.Inmueble.Vivienda.Vivienda;

public class Casa extends Vivienda {
    public Casa(int identificador, double areaM2, String direccion, int numeroDeHabitaciones, int numeroDeBanios) {
        super(identificador, areaM2, direccion, numeroDeHabitaciones, numeroDeBanios);
    }

    @Override
    public void Imprimir() {
        super.imprimir();
    }
}
