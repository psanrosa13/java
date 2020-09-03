package br.com.perifacode.logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio86 {
    //Faça um algoritmo que leia 5 grupos de 4 valores (A,B,C,D) e mostre-os na ordem lida. Em
    //seguida, ordene-os em ordem decrescente e mostre-os novamente, já ordenados.

    public static void main(String[] args) {


        Scanner leitura = new Scanner(System.in);

        List<GrupoDeNumeros86> grupos= new ArrayList();

        for (int i = 1; i <=5 ; i++) {

            System.out.println("Digite o grupo "+ i +":");

            var grupo = new GrupoDeNumeros86();

            for (int j = 1; j <=4 ; j++) {

                System.out.println("Digite o valor "+ j +":");

                int numero = leitura.nextInt();
                grupo.setNumeroPorOrdem(numero,j);

            }

            grupos.add(grupo);
        }

        grupos.forEach(grupo -> System.out.println(grupo));

        System.out.println("");
        System.out.println("Numeros Ordenados");
        for (GrupoDeNumeros86 grupoDeNumeros86: grupos) {

            grupoDeNumeros86.seOrdena();

            System.out.println(grupoDeNumeros86);


        }

    }

}
