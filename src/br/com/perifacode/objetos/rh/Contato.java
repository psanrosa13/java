package br.com.perifacode.objetos.rh;

public class Contato {

  private String email;

  private String telefone;

  public Contato(String email, String telefone) {
    this.email = email;
    this.telefone = telefone;
  }

  public void atualizaEmail(String novoEmail){

    this.email = novoEmail;
  }

  @Override
  public String toString() {
    return "Contato{" +
        "email='" + email + '\'' +
        ", telefone='" + telefone + '\'' +
        '}';
  }
}
