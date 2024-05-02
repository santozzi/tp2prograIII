package org.example.EJ10.Inmueble.Vivienda.Departamento;

public class Familiar extends Departamento{
    public Familiar(int identificador, double areaM2, String direccion, int numeroDeHabitaciones, int numeroDeBanios, double valorDeAdministracion) {
        super(identificador, areaM2, direccion, numeroDeHabitaciones, numeroDeBanios, valorDeAdministracion);
        this.valorM2 = 1800000;
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
    }
}
