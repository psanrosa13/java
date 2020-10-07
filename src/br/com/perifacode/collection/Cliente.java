package br.com.perifacode.collection;

public class Cliente {

  private int idade;

  private String nome;

  private String Estado;

  private double credito;

  public Cliente(int idade, String nome, String estado, double credito) {
    this.idade = idade;
    this.nome = nome;
    Estado = estado;
    this.credito = credito;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEstado() {
    return Estado;
  }

  public void setEstado(String estado) {
    Estado = estado;
  }

  public double getCredito() {
    return credito;
  }

  public void setCredito(double credito) {
    this.credito = credito;
  }
}
