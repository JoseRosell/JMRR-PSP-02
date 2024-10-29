package com.example;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {

        Lista lista = new Lista();

        Lector lector1 = new Lector(lista);
        Lector lector2 = new Lector(lista);
        
        Escritor escritor = new Escritor(lista);

        // Inicializo el escritor
        escritor.setName("Escritor1");
        escritor.start();
    
        // Inicializo los lectores
        lector1.setName("Lector1");
        lector1.start();
        lector2.setName("Lector2");
        lector2.start();

    }

}