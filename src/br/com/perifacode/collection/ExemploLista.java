package br.com.perifacode.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploLista {
  public static void main(String[] args) {

    // Implemente listas sempre usando a interface para evitar quebra no código em casos de refatoração.

    //Criando lista da maneira padrão
    //Esta lista ficará mutável
    List nomes = new ArrayList();

    nomes.add("Paula");
    nomes.add("Haroldo");
    nomes.add("Josiene");
    nomes.add("Donato");
    nomes.add("bdalmeida");
    nomes.add("teteus");
    nomes.add("Vivian");
    nomes.add("Gabriel");
    nomes.add("Diego");

    //é possível alterar valores da lista
    nomes.set(0, "Teste") ;
    nomes.add("Karla");

    System.out.println(nomes.get(0));

    //Maneira de garantir imutabilidade da lista

    var nomesVersaoClean = List.of("Paula", "Haroldo", "Josiene", "Donato","bdalmeida",
        "teteus", "Vivian", "Gabriel", "Diego");

    var nomesCopia = List.of(nomes);

    nomesCopia = nomesCopia.stream().filter(n -> n.contains("H")).collect(Collectors.toList());

    nomesCopia.forEach(n -> System.out.println(n));
  }
}
