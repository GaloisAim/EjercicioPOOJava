package com.luisgutierrez;

public class Shampoo extends Producto {

    private int contenido;

     Shampoo(String name, int precio, int contenido) {
        super(name, precio);
        this.contenido = contenido;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: "+ name + " /// Contenido: " + contenido + "ml /// Precio: $" + precio;
    }
}
