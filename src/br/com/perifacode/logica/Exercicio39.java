package br.com.perifacode.logica.exercicio86;

import java.util.Scanner;

public class Exercicio39 {


    /*  saber ser par ou impar*/
    public  static void main(String [] args) {

       /* Elabore um algoritmo que lê 3 valores a,b,c e verifica se eles formam ou não um triângulo.
                Supor que os valores lidos são inteiros e positivos. Caso os valores formem um triângulo,
        calcule e escreva a área desse triângulo. Se não formam triângulo, escreva os valores lidos.
        (se a > b + c não formam triângulo algum, se a é o maior).*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 numero");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        int maiorlado = 0 ;
        int lado1 = 0 ;
        int lado2 = 0 ;


        if ( a > b  &&  a > c ){
                maiorlado = a;

                lado1 = b;
                lado2 = c;

        } else if( b > a && b > c) {
            maiorlado = b;

            lado1 = a;
            lado2 = c;
        }else {

                maiorlado = c;
                lado1 = a;
                lado2 = b;
        }


        if( maiorlado > lado1 + lado2 ) {

            System.out.println("Nao é triangulo");
            System.out.println("Lado A:" +a);
            System.out.println("Lado B:" +b);
            System.out.println("Lado C:" +c);

        }else{

            int area = lado1+lado2/2;

        }




    }
}
