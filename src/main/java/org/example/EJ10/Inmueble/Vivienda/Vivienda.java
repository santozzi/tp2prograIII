package org.example.EJ10.Inmueble.Vivienda;

import org.example.EJ10.Inmueble.Inmueble;

public abstract class Vivienda extends Inmueble {
    protected int numeroDeHabitaciones;
    protected int numeroDeBanios;

    public Vivienda(int identificador, double areaM2, String direccion,int numeroDeHabitaciones,int numeroDeBanios) {
        super(identificador, areaM2, direccion);
        this.numeroDeBanios = numeroDeBanios;
        this.numeroDeHabitaciones = numeroDeHabitaciones;
    }
    public void imprimir(){
        System.out.println("N° de habitaciones: "+ numeroDeHabitaciones);
        System.out.println("N° de baños: "+ numeroDeBanios);
    }
}
