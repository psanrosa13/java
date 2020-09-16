package br.com.perifacode.objetos.rh;

public class Empresa {

  private String nome;

  private String cnpj;

  private Endereco endereco;

  private Contato contato;

  public Empresa(String nome, String cnpj, Endereco endereco,
                 Contato contato) {
    this.nome = nome;
    this.cnpj = cnpj;
    this.endereco = endereco;
    this.contato = contato;
  }

  public Contato getContato() {
    return contato;
  }

  public void atualizaContato(Contato contato) {
    this.contato = contato;
  }

}
