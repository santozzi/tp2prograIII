package org.example.EJ8.EntidadFinanciera;

public class MasterCard extends EntidadFinanciera {
    public MasterCard(){
        this.nombre = "Master Card";
    }

    @Override
    public float interes(int totalCuota, int cuotaActual) {
        //6 cuotas sin interes
        float interesTotal;
        if(totalCuota==6){
            interesTotal = 0;
        }else{
            interesTotal =  super.interes(totalCuota, cuotaActual);
        }
        return interesTotal;
    }
}
