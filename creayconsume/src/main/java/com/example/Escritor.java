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
                    try {
                        this.sleep(500);
                        lista.escribe(0);
                        break;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    case 1:
                    try {
                        this.sleep(500);
                        lista.escribe(1);
                        break;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    case 2:
                    try {
                        this.sleep(500);
                        lista.escribe(2);
                        break;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                        

                    default:
                        System.out.println(Thread.currentThread().getName() + ": Lista llena, espero ... ");
                        try {
                            lista.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                }
            }

        }
    }
}
