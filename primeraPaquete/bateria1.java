package primeraPaquete;

import java.util.Scanner;

public class bateria1
{
private static Scanner digito2;

public static void main(String args[])
{ 
	int suma=0;
	for (int i=10;i>0; i--)
	{
		digito2 = new Scanner(System.in);
	    System.out.println("Introduzca un numero");
	    int numero1 = digito2.nextInt();
	    suma=suma+numero1;
	}
	System.out.println("El resultado de la suma es: "+suma);
} 
} 