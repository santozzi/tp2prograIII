package org.example.EJ10.Inmueble.Vivienda.Casa;

public class Independiente extends Casa{
    public Independiente(int identificador, double areaM2, String direccion, int numeroDeHabitaciones, int numeroDeBanios) {
        super(identificador, areaM2, direccion, numeroDeHabitaciones, numeroDeBanios);
        this.valorM2 = 2000000;
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
    }
}
