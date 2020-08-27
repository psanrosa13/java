package br.com.perifacode.operators;

public class OperadoresComparacao {
    public static void main(String[] args) {
   /*
        Equal to	x == y
        Not equal	x != y
        Greater than	x > y
        Less than	x < y
        Greater than or equal to	x >= y
        Less than or equal to	x <= y

     */

        var x = 1;
        var y = 2;

        System.out.println("X = 1 ");
        System.out.println("Y = 2 ");

        System.out.println("----------------");
        System.out.println("Equal to x == ");
        System.out.println(x == y);

        System.out.println("----------------");
        System.out.println("Not equal x != y");
        System.out.println(x != y);

        System.out.println("----------------");
        System.out.println("Greater than x > y");
        System.out.println(x > y);

        System.out.println("----------------");
        System.out.println("Less than x < y");
        System.out.println(x < y);

        System.out.println("----------------");
        System.out.println("Greater than or equal to x >= y");
        System.out.println(x >= y);

        System.out.println("----------------");
        System.out.println("Less than or equal to x <= y");
        System.out.println(x <= y);
    }

}
