package br.com.perifacode.array;

import java.util.List;

public class ProgramaNotas {
  public static void main(String[] args) {

    // {1,2,3,4,5}

    //Criando um array em Java: coloca o tipo, tamanho e nome;
    String[] nomes = {"Paula","Fabricio","Luana","Luiz"};
    String[] nomesCores = new String[3];
    nomesCores[0] = "Amarelo";
    nomesCores[1] = "Azul";
    nomesCores[2] = "Verde";

    int[] notas = {10,8,5,7};

    int idade= 10;

    Integer idadePaula =29;

    Integer[] idades = {10,20,25,69};

    //Contruir matriz
    String [][] estados = new String[2][2];
    estados[0][0] = "São Paulo";
    estados[0][1] = "São Paulo";
    estados[1][0] = "Rio de Janeiro";
    estados[1][1] = "Rio de Janeiro";

    String [][] estadosNovos = {{"Rio","RJ"}, {"São Paulo", "SP"}};

    //pegando um item
   String primeiroNome = nomes[0];

   //pegando o tamanho/ quantidade de itens
    int quantidadeNomes = nomes.length;

    System.out.println(primeiroNome);
    System.out.println(quantidadeNomes);
  }
}
