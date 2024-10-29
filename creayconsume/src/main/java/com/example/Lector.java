package com.example;

public class Lector extends Thread {

    Lista lista = new Lista();

    public Lector(Lista lista){
        this.lista = lista;
    }

    private void espera(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void lee(int position){
        this.lista.clearValue(position);
    }




    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

}
