package org.example.EJ8;

import java.util.List;

public class Ticket {
    protected Persona titular;
    protected List<Item> items;


    public Ticket(Persona titular, List<Item> items) {
        this.titular = titular;
        this.items = items;

    }
    public String imprimir(){
        String ticket ="";
        double total = 0;
        System.out.println("Nombre: "+ titular.nombre+ " Apellido: "+titular.apellido);
        System.out.println("Cuota  Importe");
        for(Item item : items){
            System.out.println(item.cuota+"      "+item.precioUnitario);
            total += item.precioUnitario;
        }
        System.out.println("Total:"+total);
        return ticket;
    }

}
