package br.com.perifacode.logica.ordenacao;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class ImprimindoArraysDeTipoPrimitivoComAPIStreamsDoJava {

    public static void main(String[] args) {

        int[] vetor = {1, 2, 3, 4, 5};

        System.out.println(
                Arrays.stream(vetor)
                        // envelopando o tipo primitivo (int) no
                        // tipo correspondente de objeto( nesse caso o Integer)
                        .boxed()
                        // Convertendo os itens do tipo Integer em String.
                        // A classe Objects que foi adicionada no Java 7 com métodos
                        // utilitários para manipular objetos
                        .map(Objects::toString)
                        // concatenando todos os itens utilizando "," como separador
                        .collect(Collectors.joining(",")));
    }

}
