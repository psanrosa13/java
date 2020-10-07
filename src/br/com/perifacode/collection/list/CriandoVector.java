package br.com.perifacode.collection.list;

import br.com.perifacode.collection.BuildCliente;
import br.com.perifacode.collection.Cliente;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class CriandoVector {
  public static void main(String[] args) {
    /*
      Vector e ArrayList requerem espaço à medida
      que mais elementos são adicionados.
      O vetor sempre dobra seu tamanho de array,
       enquanto ArrayList aumenta 50% de seu tamanho a cada vez.

      Vector é quase idêntico a ArrayList,
      e a diferença é que Vector é sincronizado.
      Por causa disso, ele tem uma sobrecarga do que ArrayList.
      Normalmente, a maioria dos programadores Java usa ArrayList
      em vez de Vector porque eles podem sincronizar
      explicitamente por conta própria.
     */
    List clientesVector = new Vector<Cliente>();

    clientesVector.addAll(BuildCliente.listaClientes());


  }
}
