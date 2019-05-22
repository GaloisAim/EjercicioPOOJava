package com.luisgutierrez;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The ProductManager is in charge of handling and listing the added products
 */

 class ProductManager {

    private ArrayList<Producto> listaDeProductos = new ArrayList<>();


      void addProduct(Producto producto){

         this.listaDeProductos.add(producto);
    }

     void imprimir(){
        if (listaDeProductos != null && listaDeProductos.size() != 0) {

            for (Producto opc : listaDeProductos) {
                System.out.println(opc);
            }

            Collections.sort(listaDeProductos);

            System.out.println("=============================");

            System.out.println("Producto más caro: " + Collections.max(listaDeProductos).name);
            System.out.println("Producto más barato:  " + Collections.min(listaDeProductos).name);

        } else {
            System.out.println("No hay Productos para mostrar");
        }
    }




}



