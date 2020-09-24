package br.com.perifacode.String;

public class Exemplo1 {
  public static void main(String[] args) {

    String nome1 = "Paula"; // cria os bytes dessa string
    String sobrenome1 = "Santana"; // cria os bytes dessa string
    String nomeCompleto = "Paula Santana"; // resusa os bytes já criados das strings anteriores
    nomeCompleto =
        "Paula Macedo Santana"; // cria os bytes não existentes utilizando os bytes já existentes das strings anteriores
    nomeCompleto = "Barbara Silva"; // cria todos os bytes.

    //TESTANDO IMUTABILIDADE DA CLASSE STRING
    String variavel = "ABC";
    //usando modo debug irá verificar que o endereço é diferente do inferior
    System.out.println(variavel);
    // endereço modificado
    variavel = "DEF";
    System.out.println(variavel);

    String novoValor = variavel.concat("GHI");

    String teste = variavel + "GHI";

    String novoValor2 = variavel.replace("E", "A");


  }
}
