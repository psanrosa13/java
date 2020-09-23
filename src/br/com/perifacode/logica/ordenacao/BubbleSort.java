package br.com.perifacode.logica.ordenacao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSort {

    public static void main(String[] args) {

        int[] vetor = {1,88,37,96,4, 33, 40, 76, 13, 8};

        bubbleSort(vetor);

        //List.of(vetor).forEach(n -> System.out.println(n));

        for(int i = 0 ; i < vetor.length ; i++){
            System.out.print(vetor[i]);
        }

        /*
        System.out.println(
        List.of(vetor)
                .stream()
                .map( n -> String.valueOf(n))
                .collect(Collectors.toList()).toString()
        );

         */
    }

    private static void bubbleSort(int vetor[]){

        //sem ordernar = {1,88,37,96,4, 33, 40, 76, 13, 8}

        /*
            volta 1: troca = false
            for
                i = 0
                    vetor[i] = 1
                    vetor[i+1] = 88
                i = 1
                    vetor[i] = 88
                    vetor[i+1] = 37
                    Aux = 88
                    vetor[i] = vetor[i+1]
                    vetor[i+1] = 88
                i = 2
                    vetor[i] = 88
                    vetor[i+1] = 37
                    Aux = 88
                    vetor[i] = vetor[i+1]
                    vetor[i+1] = 88

         */

        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
    }
}
