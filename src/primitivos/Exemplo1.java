package primitivos;

public class Exemplo1 {
  public static void main(String[] args) {
    //tipos primitivos

    //byte	1 byte	Stores whole numbers from -128 to 127
    //bom exemplo - aceita valores dentro do limite
    byte testeByte1 = -125;
    byte testeByte2 = 25;
    byte testeByte3 = (byte) -126;

    System.out.println(testeByte1);
    System.out.println(testeByte2);
    System.out.println(testeByte3);

    //todo pesquisar sobre comparação de tipos primitivos

    //exemplo ruim - Apesar de ser permitido converter tipos menores ( aceitam um range de números menor)
    // para tipos maiores, porém ao fazer essa conversão o valor sofrerá modificações
    byte testeByte4 = (byte) -136;
    System.out.println(testeByte4);


    System.out.println("--------------------------------------------------------------------");
    //short	2 bytes	Stores whole numbers from -32,768 to 32,767
    //bom exemplo - aceita valores dentro do limite
    short testeShort1 = -31768;
    short testeShort2 = 30256;
    short testeShort3 = (short) -25654;

    System.out.println(testeShort1);
    System.out.println(testeShort2);
    System.out.println(testeShort3);

    //exemplo ruim - Apesar de ser permitido converter tipos menores ( aceitam um range de números menor)
    // para tipos maiores, porém ao fazer essa conversão o valor sofrerá modificações
    short testeShort4 = (short) -35645;
    System.out.println(testeShort4);

    //Exemplo de conversão correta:
    short testeConversaoByteParaShort = testeByte3;
    System.out.println("Convertendo o valor byte de "+testeByte3+" para short = "+testeConversaoByteParaShort);

    //int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
    //bom exemplo - aceita valores dentro do limite
    int testeint1 = -204748648;
    int testeint2 = 84748648;
    int testeint3 = (int) testeShort3 ;

    System.out.println(testeint1);
    System.out.println(testeint2);
    System.out.println(testeint3);

    //long    8 bytes    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    long testelong1 = -8588554204748648l;
    long testelong2 = 84748648;
    long testelong3 = (int) testeint3;

    System.out.println(testelong1);
    System.out.println(testelong2);
    //Exemplo de conversão correta:
    System.out.println("Convertendo o valor int de "+testeint3+" para long = "+testelong3);

    //float 4 bytes -2,147,483,648 to 2,147,483,647   Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    float testefloat1 = 555548.07f;
    float testefloat2 = 77.45555004f;
    float testefloat3 = (long) testelong3;

    System.out.println(testefloat1);
    System.out.println(testefloat2);
    System.out.println("Convertendo o valor long de "+testelong3+" para long = "+testefloat3);

    //double 8 bytes    Stores fractional numbers. Sufficient for storing 15 decimal digits
    double testedouble1 = -85885548.1234567892236;
    double testedouble2 = 77.8581234567892236;
    double testedouble3 = (float) testefloat2;

    System.out.println(testedouble1);
    System.out.println(testedouble1);
    System.out.println("Convertendo o valor float de "+testefloat2+" para double = "+testedouble3);

    //boolean	1 bit	Stores true or false values

    //char	2 bytes	Stores a single character/letter or ASCII values

    //tipos objetos

  }
}
