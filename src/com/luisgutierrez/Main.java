package com.luisgutierrez;

public class Main {

    public static void main(String[] args) {

        ProductManager manager = new ProductManager();

        manager.addProduct(new Bebida("Coca-Cola Zero",20,1.5));
        manager.addProduct(new Bebida("Coca-Cola",18,1.5));
        manager.addProduct(new Shampoo("Shampoo Sedal", 19, 500));
        manager.addProduct(new Fruta("Frutillas",64,"kilo"));

        manager.imprimir();

    }

}



