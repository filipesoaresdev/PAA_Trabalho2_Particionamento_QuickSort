package com.filipesoaresdev.quicksort;

import java.util.Random;

public class GeraLista {

    static Random gerador = new Random();

    public static int[] gera(int tamanho, int pesoVariacaoValores){

        int[] arr = new int[tamanho];
        for(int i = 0; i < tamanho; i++){
            arr[i] = gerador.nextInt(tamanho*pesoVariacaoValores);
        }
        return arr;
    }




}
