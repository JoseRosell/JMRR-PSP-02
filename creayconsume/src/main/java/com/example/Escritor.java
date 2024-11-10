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
                        this.sleep(500);
                        lista.escribe(0);
                        Thread.sleep(500);
                        break;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    case 1:
                    try {
                        this.sleep(500);
                        lista.escribe(1);
                        Thread.sleep(500);
                        break;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    case 2:
                    try {
                        this.sleep(500);
                        lista.escribe(2);
                        Thread.sleep(500);
                        break;
<<<<<<< HEAD
                        
=======
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                        

>>>>>>> 950c917746ca79573a98588eb94c9cae9a6c7494
                    default:
                        lista.escribe(3);
                        break;

                }
<<<<<<< HEAD

            } catch (InterruptedException e) {
                e.printStackTrace();
=======
>>>>>>> 950c917746ca79573a98588eb94c9cae9a6c7494
            }

        }
    }
}
