package br.com.perifacode.operators;

public class OperadoresLogicos {
    public static void main(String[] args) {

        var x = 5;

        System.out.println (x > 3 && x < 10); //true
        System.out.println  (x > 3 || x < 10); //true
        System.out.println  (   !(x < 5 && x < 10)  ); //true

    }
}
