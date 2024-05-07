package org.example.EJ8;

import org.example.EJ8.EntidadFinanciera.EntidadFinanciera;
import org.example.EJ8.persona.Cliente;


import java.util.List;

public class Ticket {
    protected Cliente titular;
    protected List<Item> items;
    protected EntidadFinanciera entidadFinanciera;


    public Ticket(Tarjeta tarjeta, List<Item> items) {
        this.titular = tarjeta.getTitular();
        this.entidadFinanciera = tarjeta.entidadFinanciera;
        this.items = items;

    }
    public String imprimir(){
        String ticket ="";
        double total = 0;
        System.out.println("Nombre: "+ titular.getNombre()+ " Apellido: "+titular.getApellido());
        System.out.println("Tarjeta: "+entidadFinanciera.getNombre());
        System.out.println("Cuota  Importe");
        for(Item item : items){
            System.out.println(item.cuota+"      "+item.precioUnitario);
            total += item.precioUnitario;
        }
        System.out.println("Total:"+total);
        return ticket;
    }

}
