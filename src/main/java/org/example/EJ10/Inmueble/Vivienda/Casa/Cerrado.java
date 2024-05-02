package org.example.EJ10.Inmueble.Vivienda.Casa;

public class Cerrado extends Casa{
    protected double valorDeAdministracion;
    protected boolean areasComunes;

    public Cerrado(int identificador, double areaM2, String direccion, int numeroDeHabitaciones, int numeroDeBanios,double valorDeAdministracion) {
        super(identificador, areaM2, direccion, numeroDeHabitaciones, numeroDeBanios);
        this.valorDeAdministracion = valorDeAdministracion;
        this.valorM2 = 2500000;
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
        System.out.println("Valor de Administracion: "+this.valorDeAdministracion);
        System.out.println("Areas comúnes: "+areasComunes);
    }
}
