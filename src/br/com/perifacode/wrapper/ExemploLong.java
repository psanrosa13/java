package br.com.perifacode.wrapper;

import java.time.LocalTime;

public class ExemploLong {
  public static void main(String[] args) {

    Long resultado = 1L;

    //Exemplo do que não fazer misturando Classes Wrapers com primitivos
    System.out.println("Tempo Inicial " + LocalTime.now());
    for(int i=0; i<1000; i++){
      long soma = resultado + i;
      resultado = soma;
    }

    System.out.println("Tempo Final " + LocalTime.now());


    //Exemplo do que fazer não misturando Classes Wrapers com primitivos

    long resultado2=1;
    System.out.println("Tempo Inicial " + LocalTime.now());
    for(int i=0; i<1000; i++){
      long soma = resultado2 + i;
      resultado2 = soma;
    }

    System.out.println("Tempo Final " + LocalTime.now());

  }
}
