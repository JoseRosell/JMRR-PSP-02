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
                        lista.escribe(0);
                        Thread.sleep(500);
                        break;

                    case 1:
                        lista.escribe(1);
                        Thread.sleep(500);
                        break;

                    case 2:
                        lista.escribe(2);
                        Thread.sleep(500);
                        break;
                        
                    default:
                        lista.escribe(3);
                        break;

                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
