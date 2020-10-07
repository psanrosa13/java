package br.com.perifacode.collection.list;

import br.com.perifacode.collection.BuildCliente;
import br.com.perifacode.collection.Cliente;
import java.util.LinkedList;
import java.util.List;

public class CriandoLinkedList {
  public static void main(String[] args) {
    /*
     LinkedList é implementado como uma lista duplamente vinculada.
     Seu desempenho em adicionar e remover é melhor do que Arraylist,
     mas pior em métodos get e set. Vector é semelhante a ArrayList,
     mas é sincronizado.
     LinkedList, no entanto, também implementa a interface Queue,
      que adiciona mais métodos do que ArrayList e Vector,
      como offer (), peek (), poll (), etc.
     */

    List<Cliente> clientesLinkedList = new LinkedList();

    clientesLinkedList.addAll(BuildCliente.listaClientes());
  }
}
