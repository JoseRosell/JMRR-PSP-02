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
<<<<<<< HEAD
                        Thread.sleep(2000);
=======
                        this.sleep(2000);
>>>>>>> 950c917746ca79573a98588eb94c9cae9a6c7494
                        break;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                        

                    case 1:
                    try {
                        lista.borra(1);
<<<<<<< HEAD
                        Thread.sleep(2000);
=======
                        this.sleep(2000);
>>>>>>> 950c917746ca79573a98588eb94c9cae9a6c7494
                        break;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                        

                    case 2:
                    try {
                        lista.borra(2);
<<<<<<< HEAD
                        Thread.sleep(2000);
                        break;
=======
                        this.sleep(2000);
                        break;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                        

>>>>>>> 950c917746ca79573a98588eb94c9cae9a6c7494
                    default:
                    lista.borra(3);
                    break;
                }
<<<<<<< HEAD
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
=======
>>>>>>> 950c917746ca79573a98588eb94c9cae9a6c7494
        }
    }

}
