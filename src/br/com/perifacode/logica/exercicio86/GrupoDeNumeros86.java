package br.com.perifacode.logica.exercicio86;

import java.util.Arrays;
import java.util.List;

public class GrupoDeNumeros86 {

    int numeroA;
    int numeroB;
    int numeroC;
    int numeroD;

    public void setNumeroPorOrdem(int numero,int ordem) {

        switch (ordem) {

            case 1:
                numeroA = numero;
                break;
            case 2:
                numeroB = numero;
                break;
            case 3:
                numeroC = numero;
                break;
            case 4:
                numeroD= numero;
                break;

        }

    }

    @Override
    public String toString() {
        return "GrupoDeNumeros86{" +
                "numeroA=" + numeroA +
                ", numeroB=" + numeroB +
                ", numeroC=" + numeroC +
                ", numeroD=" + numeroD +
                '}';
    }

    public void seOrdena() {
        int[] numeros = {numeroA,numeroB,numeroC,numeroD};
        Arrays.sort(numeros);
        int ordem = 4;
        for (int i = 0; i <4 ; i++) {
            setNumeroPorOrdem(numeros[i],ordem);
            ordem--;
        }
    }
}


