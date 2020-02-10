package primeraPaquete;

import java.util.Scanner;

public class test
{
private static Scanner digito;

public static void main(String args[])
{ 
	Scanner digito = new Scanner(System.in);
    System.out.println("Introduzca un numero");
    int numero = digito.nextInt();
    if (numero % 2 > 0)
    	 System.out.println("Su numero es impar");
      else
    	  System.out.println("Su numero es par");
    digito.close();
}
} 