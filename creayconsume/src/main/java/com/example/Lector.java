package com.example;

public class Lector extends Thread {

    Lista lista = new Lista();

    public Lector(Lista lista) {
        this.lista = lista;
    }

    @Override
    public void run() {
        while (true) {
            switch (lista.getPosicionDeTrabajo()) {
                case 0:
                    System.out.println(Thread.currentThread().getName() + ": Consume el numero " + lista.borra(0));
                    try {
                        Thread.sleep(2000);
                        notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;

                case 1:
                System.out.println(Thread.currentThread().getName() + ": Consume el numero " + lista.borra(1));
                try {
                    Thread.sleep(2000);
                    notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;

                case 2:
                System.out.println(Thread.currentThread().getName() + ": Consume el numero " + lista.borra(2));
                    try {
                        Thread.sleep(2000);
                        notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;

                default:
                System.out.println(Thread.currentThread().getName() + ": Lista vacía, espero ... ");
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
            }

        }
    }

}
