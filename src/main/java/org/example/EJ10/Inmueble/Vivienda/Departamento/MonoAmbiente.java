package org.example.EJ10.Inmueble.Vivienda.Departamento;

public class MonoAmbiente extends Departamento{
    public MonoAmbiente(int identificador, double areaM2, String direccion, int numeroDeHabitaciones, int numeroDeBanios, double valorDeAdministracion) {
        super(identificador, areaM2, direccion, numeroDeHabitaciones, numeroDeBanios, valorDeAdministracion);
        this.numeroDeHabitaciones = 0;
        this.valorM2 = 1000000;
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
    }
}
