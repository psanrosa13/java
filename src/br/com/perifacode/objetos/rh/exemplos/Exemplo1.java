package br.com.perifacode.objetos.rh.exemplos;

import br.com.perifacode.objetos.rh.Contato;
import br.com.perifacode.objetos.rh.Empresa;
import br.com.perifacode.objetos.rh.Endereco;

public class Exemplo1 {
  public static void main(String[] args) {

    Empresa empresaDaPaula = new Empresa(
        "Paula SA Limited", "78.079.170/0001-09", new Endereco(),
        new Contato("paula@teste.com", "3225214512"));

    Endereco enderecoCaio = new Endereco();
    enderecoCaio.constroiEnderecoComCep("17715-254");

    Contato contatoCaio = new Contato("caio@teste.com","5511997895521");

    Empresa empresaDoCaio = new Empresa("Caio Developers Consulting",
        "78.079.170/0001-10", enderecoCaio, contatoCaio);

    contatoCaio.atualizaEmail("testeAlteracao@teste.com");

    contatoCaio = new Contato("emailFilial@teste.com","1245687894") ;
    Empresa empresaDoCaioFilial = new Empresa("Caio Developers Consulting",
        "78.079.170/0001-10", enderecoCaio, contatoCaio);

    empresaDoCaio.atualizaContato(empresaDaPaula.getContato());

    //Imprimir os dados de contato

    //imprime o objeto contatoCaio
    System.out.println("Contato empresa do Caio :");
    System.out.println(empresaDoCaio.getContato());

    System.out.println("Contato Filial do Caio :");
    System.out.println(empresaDoCaioFilial.getContato());

    //imprime o objeto
    System.out.println(empresaDaPaula.getContato());


  }
}
