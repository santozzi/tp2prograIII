package org.example.EJ9;

import java.util.Date;

public class Repartidor extends Empleado{
    protected int cantidadDeRepartos;
    protected final double EXTRA_X_REPARTO  = 500;
    public Repartidor(String nombre, String apellido, String dni, String telefono, String email, Date fechaDeIngreso, String domicilio, int cantidadDeRepartos) {
        super(nombre, apellido, dni, telefono, email, fechaDeIngreso, domicilio);
        this.cantidadDeRepartos = cantidadDeRepartos;
        this.categoria = "Repartidor";
    }

    @Override
    public double sueldo() {
        return this.SUELDO_BASICO + cantidadDeRepartos*500;
    }
}
