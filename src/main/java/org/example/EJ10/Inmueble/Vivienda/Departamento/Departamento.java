package org.example.EJ10.Inmueble.Vivienda.Departamento;

import org.example.EJ10.Inmueble.Vivienda.Vivienda;

public class Departamento extends Vivienda {
    protected double valorDeAdministracion;
    public Departamento(int identificador, double areaM2, String direccion, int numeroDeHabitaciones, int numeroDeBanios, double valorDeAdministracion) {
        super(identificador, areaM2, direccion, numeroDeHabitaciones, numeroDeBanios);
        this.valorDeAdministracion = valorDeAdministracion;
    }

    @Override
    public void Imprimir() {
        super.imprimir();
    }
}
