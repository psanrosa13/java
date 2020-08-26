package br.com.perifacode.operators;

public class OperadoresAritmeticos {
  public static void main(String[] args) {
    var x = 10;
    var y = 5;

    //+	Addition	Adds together two values	x + y
    int exemploSoma = x+y;
    System.out.println("Imprime exemplo soma = " + exemploSoma);

    // -	Subtraction	Subtracts one value from another	x - y
    int exemploSubtracao = x-y;
    System.out.println("Imprime exemplo subtração = " + exemploSubtracao);

    // *	Multiplication	Multiplies two values	x * y
    int exemploMultiplicacao = x*y;
    System.out.println("Imprime exemplo multiplicação = " + exemploMultiplicacao);

    // /	Division	Divides one value by another	x / y
    int exemploDivisao = x/y;
    System.out.println("Imprime exemplo divisão = " + exemploDivisao);

    // %	Modulus	Returns the division remainder	x % y
    int exemploModParaResto = x%y;
    System.out.println("Imprime exemplo mod para resto = " + exemploModParaResto);

    // ++	Increment	Increases the value of a variable by 1	++x
    int exemploIncrement = x--;
    System.out.println("Imprime exemplo increment = " + exemploIncrement);
    System.out.println("Imprime exemplo increment = " + x);


    // --	Decrement	Decreases the value of a variable by 1	--x
    int exemploDecrement = x++;
    System.out.println("Imprime exemplo decrement = " + exemploDecrement);
    System.out.println("Imprime exemplo increment = " + x);
  }
}
