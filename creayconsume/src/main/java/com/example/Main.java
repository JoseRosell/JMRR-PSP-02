package com.example;

import java.util.ArrayList;

public class Main {
    public static int[] buffer = new int[3];
    
    public static void main(String[] args) {
        Lista lista = new Lista();
        Lector lector1 = new Lector(lista);
        Lector lector2 = new Lector(lista);
        Escritor escritor = new Escritor(lista);

        lector1.start();
        lector2.start();
        escritor.start();

    }

}