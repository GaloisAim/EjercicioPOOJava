package com.luisgutierrez;

public class Fruta extends Producto {

    private String unidadVenta;

     Fruta(String name, int precio, String unidadVenta) {
        super(name, precio);
        this.unidadVenta = unidadVenta;
    }

    public String getUnidadVenta() {
        return unidadVenta;
    }

    public void setUnidadVenta(String unidadVenta) {
        this.unidadVenta = unidadVenta;
    }

    @Override
    public String toString() {
        return "Nombre: "+ name + " /// Precio: $" + precio + " /// Unidad de venta: " + unidadVenta ;
    }


}
