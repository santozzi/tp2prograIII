package org.example.EJ8;

import org.example.EJ8.EntidadFinanciera.EntidadFinanciera;

import java.util.ArrayList;
import java.util.List;

public class Posnet {
    protected final double INTERES_X_CUOTA= 0.3;
    protected List<Item> items;

    public Posnet(){

        this.items = new ArrayList<Item>();

    }
    public void efectuarPago(Tarjeta tarjeta, int cuotas, double monto){
       boolean verificado = verificarSaldoEntarjeta(tarjeta,cuotas,monto);
       if(verificado){
           Ticket tiket = new Ticket(tarjeta,items);
           tiket.imprimir();
       }else{
           System.out.println("no hay fondos");
       }

    }

    //descontar de la tarjeta



    //Verificar saldo en tarjeta
    private boolean verificarSaldoEntarjeta(Tarjeta tarjeta, int cuotas, double monto){

        boolean verificado;


            double montoXCuotaSinInteres = monto/cuotas;
            double total=montoXCuotaSinInteres;

            double valorDeCuota =0;

            EntidadFinanciera entidadFinanciera = tarjeta.entidadFinanciera;
            for(int i =1; i<=cuotas;i++){
                valorDeCuota= montoXCuotaSinInteres * (1+entidadFinanciera.interes(cuotas,i));
                total +=valorDeCuota;

                items.add(new Item(i,valorDeCuota));
            }
            verificado = tarjeta.saldoTotal >= total;



        return verificado;
    }
}
