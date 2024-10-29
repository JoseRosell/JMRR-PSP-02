package com.example;

public class Escritor extends Thread {

     Lista lista = new Lista();

    public Escritor(Lista lista) {
        this.lista = lista;
    }

    

    @Override
    public void run() {
        while (true) {
            switch (lista.getPosicionDeTrabajo()) {
                case 0:
                
                    System.out.println(Thread.currentThread().getName() + ": Produce el numero " + lista.escribe(0));
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                

                case 1:
                
                    System.out.println(Thread.currentThread().getName() + ": Produce el numero " + lista.escribe(1));
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                

                case 2:
                    System.out.println(Thread.currentThread().getName() + ": Produce el numero " + lista.escribe(2));
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                

                default:
                    System.out.println("Lista llena, espero ... ");
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
