package com.luisgutierrez;



public abstract class Producto implements Comparable <Producto>{

     String name;
     int precio;

     Producto(String name, int precio) {
        this.name = name;
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int compareTo(Producto other) {
        if (this.precio < other.precio) {
            return -1;
        }

        if (this.precio == other.precio) {
            return 0;
        }

        return 1;
    }

}
