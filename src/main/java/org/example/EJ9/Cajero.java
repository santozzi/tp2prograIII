package org.example.EJ9;

import java.util.Date;

public class Cajero extends Empleado {

    public Cajero(String nombre, String apellido, String dni, String telefono, String email, Date fechaDeIngreso, String domicilio) {
        super(nombre, apellido, dni, telefono, email, fechaDeIngreso, domicilio);
        this.categoria = "Cajero";
    }

    @Override
    public double sueldo() {
        return this.SUELDO_BASICO;
    }


}
