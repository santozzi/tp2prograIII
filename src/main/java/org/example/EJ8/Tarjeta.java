package org.example.EJ8;

import org.example.EJ8.EntidadFinanciera.EntidadFinanciera;
import org.example.EJ8.persona.Cliente;
import org.example.EJ8.persona.Persona;
import org.example.EJ8.persona.Titular;

public class Tarjeta {
    protected EntidadFinanciera entidadFinanciera;
    protected String entidadBancaria;
    protected Titular titular;
    protected String nroDeTarjeta;
    protected double saldoTotal;

    public Tarjeta(EntidadFinanciera entidadFinanciera, String entidadBancaria, Titular titular, String nroDeTarjeta, double saldoTotal) {
        this.entidadFinanciera = entidadFinanciera;
        this.entidadBancaria = entidadBancaria;
        this.titular = titular;
        this.nroDeTarjeta = nroDeTarjeta;
        this.saldoTotal = saldoTotal;

    }

    public EntidadFinanciera getEntidadFinanciera() {
        return entidadFinanciera;
    }

    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    public Titular getTitular() {
        return titular;
    }

    public String getNroDeTarjeta() {
        return nroDeTarjeta;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }
}
