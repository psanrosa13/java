package br.com.perifacode.collection.list;

import br.com.perifacode.collection.BuildCliente;
import br.com.perifacode.collection.Cliente;
import java.util.List;
import java.util.stream.Collectors;

public class UsandoJavaOitoComArrayList {
  public static void main(String[] args) {
    List<Cliente> clientes = BuildCliente.listaClientes();

    //empresa quer fazer uma campanha para clientes que possuem mais de 34 anos
    List<Cliente> clientesSelecionados = clientes.stream()
                                        .filter(c -> c.getIdade() >= 34)
                                        .collect(Collectors.toList());

    System.out.println("___________________________________");
    //filtrando clientes
    clientesSelecionados.forEach(c -> System.out.println(c.getNome()));

    //remove itens
    System.out.println("___________________________________");
    clientes.removeIf(c -> c.getIdade() <= 34 );
    clientes.forEach(c -> System.out.println(c.getNome()));
    
  }

}
