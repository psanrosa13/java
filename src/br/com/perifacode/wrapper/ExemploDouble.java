package br.com.perifacode.wrapper;

import java.time.LocalTime;

public class ExemploDouble {
  public static void main(String[] args) {

    //Exemplo do que não fazer misturando Classes Wrapers com primitivos
    Double resultado = 1D;

    System.out.println("Tempo Inicial " + LocalTime.now());
    for(int i =0; i< 8000; i++){
      double soma = resultado +i;
      resultado = soma;
    }

    System.out.println("Tempo Final " + LocalTime.now());

    //Exemplo do que fazer não misturando Classes Wrapers com primitivos
    System.out.println("----------------------------------------");
    double resultado2 = 1;

    System.out.println("Tempo Inicial " + LocalTime.now());
    for(int i =0; i< 8000; i++){
      double soma = resultado2 +i;
      resultado2 = soma;
    }

    System.out.println("Tempo Final " + LocalTime.now());

    ObjetoExemplo objetoExemplo = new ObjetoExemplo();

    System.out.println(objetoExemplo.getVar1());
    System.out.println(objetoExemplo.getVar2());

  }
}
