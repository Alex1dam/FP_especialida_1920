package primeraPaquete;

import java.util.Scanner;

public class bateria2
{
private static Scanner veces;
private static Scanner veces2;

public static void main(String args[])
{ 

	veces = new Scanner(System.in);
    System.out.println("Introduzca cuantas veces quiere sumar");
    int a = veces.nextInt();
	int suma=0;
	for (int i=a;i>0; i--)
	{
		veces2 = new Scanner(System.in);
	    System.out.println("Introduzca un numero");
	    int numero1 = veces2.nextInt();
	    suma=suma+numero1;
	}
	System.out.println("El resultado de la suma es: "+suma);
} 
} 