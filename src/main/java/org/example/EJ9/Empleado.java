package org.example.EJ9;

import org.example.EJ8.Persona;

import java.util.Date;

public abstract class Empleado extends Persona {
    protected Date fechaDeIngreso;
    protected final double SUELDO_BASICO = 650000;
    protected String categoria;
    protected String domicilio;
    public Empleado(String nombre, String apellido, String dni, String telefono, String email, Date fechaDeIngreso, String domicilio) {
        super(nombre, apellido, dni, telefono, email);
        this.fechaDeIngreso = fechaDeIngreso;
        this.domicilio = domicilio;

    }
    public abstract double sueldo();
    public  void imprimirRecibo(){
        System.out.println("Nombre: "+ this.nombre+" "+ this.apellido);
        System.out.println("DNI: "+ this.dni);
        System.out.println("Domicilio: "+ this.domicilio);
        System.out.println("Fecha de ingreso: "+ this.fechaDeIngreso.toString());
        System.out.println("Categoria: "+ this.categoria);
        System.out.println("Sueldo básico:" + this.SUELDO_BASICO);
        System.out.println("Total a cobrar: "+sueldo());

    }


}
