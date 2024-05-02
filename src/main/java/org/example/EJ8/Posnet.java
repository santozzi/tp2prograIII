package org.example.EJ8;

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
           Ticket tiket = new Ticket(tarjeta.titular,items);
           tiket.imprimir();
       }else{
           System.out.println("no hay fondos");
       }

    }

    //descontar de la tarjeta



    //Verificar saldo en tarjeta
    private boolean verificarSaldoEntarjeta(Tarjeta tarjeta, int cuotas, double monto){

        boolean verificado;
        if(cuotas ==1 && tarjeta.saldoTotal >= monto){
            items.add(new Item(cuotas,monto));
            verificado = true;
        }else{

            double montoXCuotaSinInteres = monto/cuotas;
            double total=montoXCuotaSinInteres;
            double interesAcumulado = INTERES_X_CUOTA;
            double valorDeCuota =0;
            items.add(new Item(1,montoXCuotaSinInteres));
            for(int i =2; i<=cuotas;i++){
                valorDeCuota= montoXCuotaSinInteres * (1+interesAcumulado);
                total +=valorDeCuota;
                interesAcumulado += interesAcumulado;
                items.add(new Item(i,valorDeCuota));
            }
            verificado = tarjeta.saldoTotal >= total;


        }
        return verificado;
    }
}
