package com.example;

public class Escritor extends Thread {

    Lista lista = new Lista();

    public Escritor(Lista lista) {
        this.lista = lista;
    }

    @Override
    public void run() {
        while (true) {

            try {
                switch (lista.getPosicionDeTrabajo()) {
                    case 0:
                    try {
                        lista.escribe(0);
                        Thread.sleep(500);
                        break;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    case 1:
                    try {
                        lista.escribe(1);
                        Thread.sleep(500);
                        break;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    case 2:
                    try {
                        lista.escribe(2);
                        Thread.sleep(500);
                        break;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                        

                    default:
                        lista.escribe(3);
                        Thread.sleep(500);
                        break;

                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
