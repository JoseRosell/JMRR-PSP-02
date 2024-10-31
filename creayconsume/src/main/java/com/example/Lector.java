package com.example;

public class Lector extends Thread {

    Lista lista = new Lista();

    public Lector(Lista lista) {
        this.lista = lista;
    }

    @Override
    public void run() {

        while (true) {

            synchronized (lista) {
                switch (lista.getPosicionDeTrabajo()) {
                    case 0:
                    try {
                        lista.borra(0);
                        this.sleep(2000);
                        break;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                        

                    case 1:
                    try {
                        lista.borra(1);
                        this.sleep(2000);
                        break;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                        

                    case 2:
                    try {
                        lista.borra(2);
                        this.sleep(2000);
                        break;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                        

                    default:
                        System.out.println(Thread.currentThread().getName() + ": Lista Vacía, espero ... ");
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
