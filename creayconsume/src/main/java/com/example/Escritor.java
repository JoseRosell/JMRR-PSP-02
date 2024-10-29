package com.example;

import java.util.Random;

public class Escritor extends Thread {

    private Lista lista = new Lista();

    public Escritor(Lista lista) {
        this.lista = lista;
    }

    /**
     * Método que escribe donde se le indica, una cifra aleatoria entre 1 y 100
     * 
     * @param position posición del Buffer en el que escribe el nuevo numero
     */
    private int escribe(int position) {
        Random random = new Random();
        int numero = random.nextInt(99);
        numero++;
        this.lista.setValue(position, numero);
        return numero;
    }

    private void espera() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            switch (this.lista.getFreePosition()) {
                case 0:
                synchronized (lista) {
                    System.out.println(Thread.currentThread().getName() + ": Produce el numero " + escribe(0));
                    espera();
                    break;
                }

                case 1:
                synchronized (lista) {
                    System.out.println(Thread.currentThread().getName() + ": Produce el numero " + escribe(1));
                    espera();
                    break;
                }

                case 2:
                synchronized (lista) {
                    System.out.println(Thread.currentThread().getName() + ": Produce el numero " + escribe(2));
                    espera();
                    break;
                }

                default:
                    System.out.println("Lista llena, espero ... ");
                    espera();
                    break;
            }

        }
    }
}
