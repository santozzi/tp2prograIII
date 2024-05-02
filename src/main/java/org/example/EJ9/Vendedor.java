package org.example.EJ9;

import java.util.Date;

public class Vendedor extends Empleado {
    protected double totalDeVentas;
    protected final float  PORCENTAJE_COMISION =0.5f;

    public Vendedor(String nombre, String apellido, String dni, String telefono, String email, Date fechaDeIngreso, String domicilio,double totalDeVentas) {
        super(nombre, apellido, dni, telefono, email, fechaDeIngreso, domicilio);
        this.categoria = "Vendedor";
        this.totalDeVentas = totalDeVentas;
    }


    @Override
    public double sueldo() {
        return this.SUELDO_BASICO + this.totalDeVentas * this.PORCENTAJE_COMISION ;
    }



    public double getTotalDeVentas() {
        return totalDeVentas;
    }

    public void setTotalDeVentas(double totalDeVentas) {
        this.totalDeVentas = totalDeVentas;
    }
}
