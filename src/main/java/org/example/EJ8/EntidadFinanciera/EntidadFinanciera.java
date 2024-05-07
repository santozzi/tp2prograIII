package org.example.EJ8.EntidadFinanciera;

public abstract class EntidadFinanciera {
    protected String nombre;
    protected final float INTERES = 0.3f;
    public float interes(int totalCuota, int cuotaActual){
        float interesPorCouta = 0;
        if (cuotaActual>1){
            for(int i=2 ;i<=cuotaActual;i++){
                interesPorCouta += INTERES;
            }
        }

        return interesPorCouta;
    }
    public String toString(){
        return nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
}
