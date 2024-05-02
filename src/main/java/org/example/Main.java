package org.example;

import org.example.EJ9.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
      /*
        System.out.println("Ej8");
        Persona titular = new Persona(
                "Sergio","Antozzi","301202030",
                "3423422","santozzi@gmail.com"
        );
        Tarjeta visa = new Tarjeta(new Visa(),"Provincia",titular,"1234-5678-9012-3456",190000);
        Posnet posnet = new Posnet();
        posnet.efectuarPago(visa,5,10000);
      */
        System.out.println("Ej9");
        Empleado empleado = new Vendedor(
                "Sergio","Antozzi","301202030",
                "3423422","santozzi@gmail.com",new Date(2000,10,3),"Av siempre viva 1234",50000
        );

        empleado.imprimirRecibo();
        System.out.println();
        System.out.println("*------------------------------------------------------*");
        System.out.println();
        empleado = new Cajero("Sergio","Antozzi","301202030",
                "3423422","santozzi@gmail.com",new Date(2000,10,3),"Av siempre viva 1234");
        empleado.imprimirRecibo();

        System.out.println();
        System.out.println("*------------------------------------------------------*");
        System.out.println();
        empleado = new Administrativo("Sergio","Antozzi","301202030",
                "3423422","santozzi@gmail.com",new Date(2000,10,3),"Av siempre viva 1234",4);
        empleado.imprimirRecibo();
        System.out.println();
        System.out.println("*------------------------------------------------------*");
        System.out.println();
        empleado = new Repartidor("Sergio","Antozzi","301202030",
                "3423422","santozzi@gmail.com",new Date(2000,10,3),"Av siempre viva 1234",4);
        empleado.imprimirRecibo();
    }


}