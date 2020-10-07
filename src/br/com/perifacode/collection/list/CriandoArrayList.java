package br.com.perifacode.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CriandoArrayList {
  public static void main(String[] args) {

    /*
    ArrayList é implementado como uma matriz redimensionável
    À medida que mais elementos são adicionados a ArrayList,
     seu tamanho é aumentado dinamicamente. Seus elementos
     podem ser acessados diretamente usando os métodos get e set,
      uma vez que ArrayList é essencialmente um array.
      ArrayList é uma escolha melhor se o seu programa for thread-safe.
      Vector e ArrayList requerem espaço à medida
       que mais elementos são adicionados.
       O vetor sempre dobra seu tamanho de array,
       enquanto ArrayList aumenta 50% de seu tamanho a cada vez.
       A capacidade inicial padrão de um ArrayList é muito pequena.
        É um bom hábito construir a ArrayList com uma capacidade inicial maior.
         Isso pode evitar o custo de redimensionamento.

     */

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
