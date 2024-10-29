package com.example;

import java.util.Random;

public class Lista {
    private int[] lista = new int[3];

    public Lista() {
    }

    /**
     * 
     * @return primera posición libre de la lista, 
     * si está todo libre devuelve 0, si está todo ocupado devuelve 3
     */
    public int getFreePosition() {
        if(this.lista[0] == 0){
            return 0;
        }else if(this.lista[1] == 0){
            return 1;
        }else if (this.lista[2] == 0){
            return 2; 
        }else{
            return 3;
        }
    }
    
/**
 *  Elimina el numero almacenado en una determinada posición
 * @param pos Posición del valor a eliminar
 */
    public void clearValue(int pos) {
        this.lista[pos] = 0;
    }

    /*
     * Introduce en una posición del array (pos) un valor (val)
     * @param pos posición del array
     * @param val valor a introducir
    * */
    public void setValue(int pos, int val) {
        this.lista[pos] = val;
    }
}
