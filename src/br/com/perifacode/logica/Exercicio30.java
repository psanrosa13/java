package br.com.perifacode.logica;

import java.util.Scanner;

public class Exercicio30 {
  public static void main(String[] args) {
    /*
    Escreva um algoritmo que leia o RA (código) de um aluno e suas três notas. Calcule a média
    ponderada do aluno, considerando que o peso para a maior nota seja 4 e para as duas
    restantes, 3. Mostre o RA do aluno, suas três notas, a média calculada e uma mensagem
    "APROVADO" se a média for maior ou igual a 5 e "REPROVADO" se a média for menor que
    5.*/

    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite o RA do aluno:");
    int ra = leitor.nextInt();

    System.out.println("Digite a primeira nota:");
    double nota1 = leitor.nextDouble();

    System.out.println("Digite a segunda nota:");
    double nota2 = leitor.nextDouble();

    System.out.println("Digite a terceira nota:");
    double nota3 = leitor.nextDouble();


    double media = ( (nota1*4) + (nota2*3) + (nota3*3) ) / (4+3+3);

    System.out.println("RA : "+ra);
    System.out.println("Nota1 : "+nota1);
    System.out.println("Nota2 : "+nota2);
    System.out.println("Nota3 : "+nota3);
    System.out.println("Média : "+media);

    if(media>=5){
      System.out.println("APROVADO");
    } else {
      System.out.println("REPROVADO");
    }

  }
}
