package br.com.perifacode.wrapper;

import java.time.LocalTime;

public class ExemploLong {
  public static void main(String[] args) {

    Long resultado = 1L;

    System.out.println("Tempo Inicial " + LocalTime.now());
    for(int i=0; i<1000; i++){
      long soma = resultado + i;
      resultado = soma;
    }

    System.out.println("Tempo Final " + LocalTime.now());

  }
}
