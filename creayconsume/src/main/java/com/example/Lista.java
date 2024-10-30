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
    public int getPosicionDeTrabajo() {
        synchronized(this){
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
    }

    /**
     * Método que escribe donde se le indica, una cifra aleatoria entre 1 y 100
     * 
     * @param position posición del Buffer en el que escribe el nuevo numero
     */
    public synchronized void escribe(int position) {
        if (position == 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }

        }
        Random random = new Random();
        int numero = random.nextInt(99) + 1;
        this.lista[position] = numero;
        System.out.println(Thread.currentThread().getName() + ": Produce el numero " + numero);
        notifyAll();
    }

    /**
     * Elimina el numero almacenado en una determinada posición
     * 
     * @param pos Posición del valor a eliminar
     */
    public synchronized void borra(int pos) {
        if (pos == 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }

        }
        int vuelta = this.lista[pos];
        this.lista[pos] = 0;
        System.out.println(Thread.currentThread().getName() + ": Consume el numero " + vuelta);
        notifyAll();
        
    }
}
