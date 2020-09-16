package br.com.perifacode.objetos.rh;

public class Endereco {

  private String rua;

  private String cep;

  private String cidade;

  private String  estado;

  private String bairro;

  private String pais;

  public void constroiEnderecoComCep(String cep){
    //consultaria o endereço pelo cep e preencheria os campos;

    this.cep= cep;
    this.pais = "Brasil";
    this.bairro= "Liberdade";
    this.cidade = "SP";
    this.estado = "SP";
    this.rua = "Rua sei lá ";

  }

}
