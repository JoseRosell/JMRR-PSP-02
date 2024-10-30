package com.example;

public class Escritor extends Thread {

    Lista lista = new Lista();

    public Escritor(Lista lista) {
        this.lista = lista;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lista) {

                switch (lista.getPosicionDeTrabajo()) {
                    case 0:
                        lista.escribe(0);
                        break;

                    case 1:
                        lista.escribe(1);
                        break;

                    case 2:
                        lista.escribe(2);
                        break;

                    default:
                        System.out.println(Thread.currentThread().getName() + ": Lista llena, espero ... ");
                        try {
                            lista.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                }

                try {
                    this.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
