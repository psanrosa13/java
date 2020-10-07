package br.com.perifacode.collection;

import java.util.ArrayList;
import java.util.List;

public class BuildCliente {

  public static List<Cliente> listaClientes(){
    Cliente c1 = new Cliente(30, "Luana da Silva","SP",1800);
    Cliente c2 = new Cliente(37, "Jorge Pereira","GO",750);
    Cliente c3 = new Cliente(20, "Karla Souza","SC",3050);
    Cliente c4 = new Cliente(19, "Fernanda Ferraz","SP",600);
    Cliente c5 = new Cliente(18, "Priscila Luna","SP",2500);
    Cliente c6 = new Cliente(47, "Tereza Dias","GO",1400);
    Cliente c7 = new Cliente(55, "Hugo Assis","SC",1200);
    Cliente c8 = new Cliente(25, "Joana Felix","SP",900);
    Cliente c9 = new Cliente(33, "Adriano Souza","SP",1750);
    Cliente c10 = new Cliente(57, "Luiz Garcia","GO",750);
    Cliente c11 = new Cliente(27, "Tatiane Luz","SC",3050);
    Cliente c12 = new Cliente(49, "Aline Silva","SP",710);
    Cliente c13 = new Cliente(28, "Jorge Garcia","SP",6000);
    Cliente c14 = new Cliente(67, "Vitor Carvalho","GO",1900);
    Cliente c15 = new Cliente(45, "Danilo Reis","SC",2750);
    Cliente c16 = new Cliente(52, "Ingrid dos Santos","SP",3100);

    List lista = new ArrayList();
    lista.addAll(List.of(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16));
    return lista;
  }

}
