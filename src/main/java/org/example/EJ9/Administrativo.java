package org.example.EJ9;

import java.util.Date;

public class Administrativo extends Empleado{
    protected int horasTrabajadas;

    public Administrativo(String nombre, String apellido, String dni, String telefono, String email, Date fechaDeIngreso, String domicilio, int horasTrabajadas) {
        super(nombre, apellido, dni, telefono, email, fechaDeIngreso, domicilio);
        this.horasTrabajadas = horasTrabajadas;
        this.categoria = "Administrativo";
    }

    @Override
    public double sueldo() {
        /**
         * Suponiendo que el sueldo básico es por 8 horas de trabajo, calculo la hora de trabajo por el básico / 8
         */

        return (this.SUELDO_BASICO/8)*this.horasTrabajadas;
    }
}
