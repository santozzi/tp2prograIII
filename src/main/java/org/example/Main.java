package org.example;

import org.example.EJ8.EntidadFinanciera.Visa;
import org.example.EJ8.Persona;
import org.example.EJ8.Posnet;
import org.example.EJ8.Tarjeta;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ej8");
        Persona titular = new Persona(
                "Sergio","Antozzi","301202030",
                "3423422","santozzi@gmail.com"
        );
        Tarjeta visa = new Tarjeta(new Visa(),"Provincia",titular,"1234-5678-9012-3456",190000);
        Posnet posnet = new Posnet();
        posnet.efectuarPago(visa,5,10000);
    }
}