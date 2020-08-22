package br.com.perifacode.wrapper;

import java.time.Instant;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploInteger {
  public static void main(String[] args) {

    int idade = 29;
    Integer idadeWrapper = Integer.valueOf(29);
    Integer idadeWrapper2 = Integer.valueOf(29);

    System.out.println(Integer.compare(idadeWrapper2, idadeWrapper));

    Comparator<Integer> order= (i1, i2) -> (i1 < i2) ? -1 : (i1 == i2) ? 0 : 1;
    //Entender porque a comparação funcionou
    System.out.println(order.compare(idadeWrapper2,idadeWrapper));

    System.out.println("-----------------------------------------------");
    System.out.println("Tempo inicial "+ LocalTime.now());

    Integer resultado=1;

    for (int i =0; i<=80000; i++){
      int somaAnterior = resultado + i;
      resultado = somaAnterior;
    }

    System.out.println("-----------------------------------------------");
    System.out.println("Tempo final "+ LocalTime.now());

    int resultado2 =1;

    for (int i =0; i<=80000; i++){
      int somaAnterior = resultado + i;
      resultado = somaAnterior;
    }

    System.out.println("Tempo final "+ LocalTime.now());

    List lista = new ArrayList();
    lista.add("Paula");

  }
}
