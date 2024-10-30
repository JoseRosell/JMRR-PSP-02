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
                        lista.borra(0);
                        break;

                    case 1:
                        lista.borra(1);
                        break;

                    case 2:
                        lista.borra(2);
                        break;

                    default:
                        System.out.println(Thread.currentThread().getName() + ": Lista Vacía, espero ... ");
                        try {
                            lista.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                }
            
            try {
                this.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
    }

}
