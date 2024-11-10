package com.example;

public class Lector extends Thread {

    Lista lista = new Lista();

    public Lector(Lista lista) {
        this.lista = lista;
    }

    @Override
    public void run() {

        while (true) {
            try {
                switch (lista.getPosicionDeTrabajo()) {
                    case 0:
                    try {
                        lista.borra(0);
                        Thread.sleep(2000);
                        break;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                        

                    case 1:
                    try {
                        lista.borra(1);
                        Thread.sleep(2000);
                        break;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                        

                    case 2:
    
                        lista.borra(2);
                        Thread.sleep(2000);
                        break;


                    default:
                    lista.borra(3);
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
