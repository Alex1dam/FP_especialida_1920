package primeraPaquete;

import java.util.Scanner;

public class bateria10
{
private static Scanner digito;

public static void main(String args[])
{ 
	int numero=0;
	int suma=0;
	int a=0;
	while (a<50)
	{
 numero=numero+2;
   if (numero>=10&numero<=50)
	   suma=suma+numero;
   a++;
	}
	System.out.println("el resultado es: "+suma);
} 
} 