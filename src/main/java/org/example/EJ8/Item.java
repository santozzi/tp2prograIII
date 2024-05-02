package org.example.EJ8;

public class Item {
    protected  int cuota;
    protected  double precioUnitario;

    public Item(int cuota, double precioUnitario) {
        this.cuota = cuota;
        this.precioUnitario = precioUnitario;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
