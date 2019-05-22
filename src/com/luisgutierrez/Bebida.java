package com.luisgutierrez;

public class Bebida extends Producto {

    private double litros;

      Bebida(String name, int precio, double litros) {
        super(name, precio);
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: "+ name + " /// Litros: " + litros + " /// Precio: $" + precio;
    }
}
