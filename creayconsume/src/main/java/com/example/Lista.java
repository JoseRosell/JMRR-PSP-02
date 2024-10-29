package com.example;

import java.util.Random;

public class Lista {

    private int[] lista = new int[3];

    public Lista() {
    }

    /**
     * 
     * @return primera posición libre de la lista en la que el hilo puede trabajar
     * 
     */
    synchronized public int getPosicionDeTrabajo() {

        if (this.lista[0] == 0) {
            if (Thread.currentThread().getName().equals("Escritor1")) {
                return 0;
            } else {
                return 3;
            }

        } else if (this.lista[1] == 0) {
            if (Thread.currentThread().getName().equals("Escritor1")) {
                return 1;
            } else {
                return 0;
            }

        } else if (this.lista[2] == 0) {
            if (Thread.currentThread().getName().equals("Escritor1")) {
                return 2;
            } else {
                return 1;
            }
        } else {
            if (Thread.currentThread().getName().equals("Escritor1")) {
                return 3;
            } else {
                return 2;
            }
        }
    }

    /**
     * Método que escribe donde se le indica, una cifra aleatoria entre 1 y 100
     * 
     * @param position posición del Buffer en el que escribe el nuevo numero
     */
    public int escribe(int position) {
        Random random = new Random();
        int numero = random.nextInt(99);
        numero++;
        this.setValue(position, numero);
        return numero;
    }

    /*
     * Introduce en una posición del array (pos) un valor (val)
     * 
     * @param pos posición del array
     * 
     * @param val valor a introducir
     */
    public void setValue(int pos, int val) {
        this.lista[pos] = val;
    }

    /**
     * Elimina el numero almacenado en una determinada posición
     * 
     * @param pos Posición del valor a eliminar
     */
    private void borrarValor(int pos) {
        this.lista[pos] = 0;
    }
}
